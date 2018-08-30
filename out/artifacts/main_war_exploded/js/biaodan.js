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
        inspect : oInputs[1],//密码
        hints : oInputs[1].nextElementSibling,//提示文本的节点
        check : {
            type :'reg',//正则匹配
            reg : '^([\\w|\\.|#|@|,|\\?|\\$]){8,16}$',//英文 数字 _ . # @ ?
            success : '',
            error : '密码长度为8-16位'
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
// oInputs[0].focus();
//表单提交
oForm.addEventListener('submit',function(e){
    for (var i = 0,iL = oInputs.length; i < iL;i++) {
        oInputs[i].focus();
        oInputs[i].blur();//主动失去焦点触发
    }
    var errors = this.getElementsByClassName('error');
    if(errors.length === 0){
        console.log('验证成功可以提交');
        $(".dlz").val("登录中...");
            // $.ajax({
            //     url : 'login',
            //     type : "get",
            //     dataType : "String",
            //     data : $('form').serialize(),//将form表单里所有的数据串联起来
            //     success : function(data){
            //         console.log(data)
            //     }
            // });
        oForm.action = "login";
        oForm.submit();
    }else{
        console.log('验证失败不可以提交')
    }
    e.preventDefault();
    return false;
});

function hintsShow(ele,blooe,str){
    ele.className = blooe ? 'success' : 'error';
    ele.innerHTML = str;
}


$(".comm-p").on("click",function() {
    var $this = $(this),
        ff = $this.parent().parent(),
        comm = ff.find(".comm");
    comm.toggle(300);
});

$(".ping").hover(function() {
    $(this).focus();
},function () {

});

$(".ping").focus(function() {
    $(this).val("");
});

$(".fa").on("click",function(){
    var $this = $(this),
        ff = $this.parent(),
        $input = ff.find("input"),
        oList = ff.find("ul"),
        oping = ff.find(".ping");
    var postid = $input.val();
    console.log(postid);
    var val = oping.val();
    if(val != ""){
        var jie = "<li><span><img src='images/f_noface.png' alt=''></span><span>"+val+"</span></li><hr>";
        oList.append(jie);

        $.ajax({
            url:'addcomment',
            type:'post',
            datatype:"json",
            data:
            {"comment.text":val,
             "comment.c_postid":postid
            },
            success:function(){
                console.log("成功");
            }
        });
    }
});
