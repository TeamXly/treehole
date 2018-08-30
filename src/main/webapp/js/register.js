
var oForm = document.getElementById('reg-form'),
    oInputs = oForm.getElementsByTagName('input');

//需要匹配正则的列
var checkAttr = [
    {
        inspect : oInputs[0],//需要验证的input标签
        hints : oInputs[0].nextElementSibling,//提示文本的节点
        check : {
            type : 'reg',//默认使用正则匹配
            reg : '^1[3-9]\\d{9}$',
            success : '',
            error : '手机号验证失败'
        }
    },
    {
        inspect : oInputs[1],//昵称
        hints : oInputs[1].nextElementSibling,//提示文本的节点
        check : {
            type :'reg',//正则匹配
            reg : '^[\\w|\\u4e00-\\u9fa5]{2,6}$',//昵称 中文 英文 数字 _
            success : '',
            error : '昵称验证失败'
        }
    },
    {
        inspect : oInputs[2],//密码
        hints : oInputs[2].nextElementSibling,//提示文本的节点
        check : {
            type :'reg',//正则匹配
            reg : '^([\\w|\\.|#|@|,|\\?|\\$]){8,16}$',//英文 数字 _ . # @ ?
            success : '',
            error : '密码只能包含 字母 数字 _ . # @ ?并且长度为8-16位'
        }
    },
    {
        inspect : oInputs[3],//确认密码
        hints : oInputs[3].nextElementSibling,//提示文本的节点
        check : {
            type :'inspect',//对比
            check : oInputs[2],
            success : '',
            error : '两次密码不一致'
        }
    },
    {
        inspect : oInputs[4],//邮箱
        hints : oInputs[4].nextElementSibling,
        check : {
            type :'reg',//对比
            reg : '^\\w+@\\w{2,10}\\.\\w{2,6}(\\.\\w{2,6})?$',//dsdasd@xx.xxx 13123123@com.cn
            success : '',
            error : '邮箱验证'
        }
    }
];

//验证input
for(var i = 0,iL = checkAttr.length;i < iL;i++){
    (function(thatAttr){
        thatAttr.inspect.addEventListener('blur', function(){
            //判断是否为正则匹配
            if(thatAttr.check.type == 'reg'){
                this.statu = new RegExp(thatAttr.check.reg).test(this.value);
                hintsShow(thatAttr.hints,this.statu,this.statu ? thatAttr.check.success : thatAttr.check.error);
            }
            //两者之间进行对比
            if(thatAttr.check.type == 'inspect'){
                this.value = this.value.replace(/^\s+|\s+$/g,'');
                this.statu = this.value != '' && this.value == thatAttr.check.check.value;
                hintsShow(thatAttr.hints,this.statu,this.statu ? thatAttr.check.success : thatAttr.check.error);
            }
        });
    })(checkAttr[i]);
}
//默认第一个获取焦点，防止用户一进来就提交
//    oInputs[0].focus();
//表单提交
oForm.addEventListener('submit',function(e){

    for (var i = 0,iL = oInputs.length; i < iL;i++) {
        oInputs[i].focus();
        oInputs[i].blur();//主动失去焦点触发
    }

    var errors = this.getElementsByClassName('error');

    if(errors.length === 0){

        console.log('验证成功可以提交');
//            $.ajax({
//                type: "POST",//方法
//                url: "register" ,//表单接收url
//                data: $('#reg-form').serialize(),
//                success: function () {
//                    //提交成功的提示词或者其他反馈代码
//                    var result=$(".success");
//                    result.innerHTML="成功!";
//                },
//                error : function() {
//                    //提交失败的提示词或者其他反馈代码
//                    var result=$(".success");
//                    result.innerHTML="失败!";
//                }
//            });
        oForm.action = "register";
        oForm.submit();
    }else{

        console.log('验证失败不可以提交')
    }
    e.preventDefault();
});

function hintsShow(ele,blooe,str){
    ele.className = blooe ? 'success' : 'error';
    ele.innerHTML = str;
}
