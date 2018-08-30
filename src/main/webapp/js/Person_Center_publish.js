var Error_msg;
$(document).ready(function() {
    $('#sideMenu').sideToggle({
        moving: '#sideMenuContainer',
        direction: 'right'
    });
    /*
    *    将名字  变成的用户名
    * */
    var username=$.cookie('username');
    if(username!=null){
        $('.Person_Center_Username').hide();
        $('.Person_Center_Cookie').show();
        $('.Person_Center_Cookie').html(username);
    }

    /*
    * 表单验证
    * */
    $('#my_From input').blur(function () {
        $parent=$(this).parent();
        $parent.find(".onError").remove();
        if($(this).val()==''){
            Error_msg='输入标题不能为空';
            $parent.append('<span class="onError">'+Error_msg+'</span>');
        }else if($(this).val().length==15){
            Error_msg='标题不能超过15个字';
            $parent.append('<span class="onError">'+Error_msg+'</span>');
        }
    }).keyup(function () {
        $(this).triggerHandler('blur');
    }).focus(function () {
        $(this).triggerHandler('blur');
    })

    var textarea=$('#my_From textarea');
    $('.btn').on('click',function (event) {
        if(textarea.val()==''){
            alert("请输入内容");
            event.preventDefault();
        }else {
            $('.btn').submit();
        }
    })

});

var ele_textarea = document.getElementById('md_editor');
var editor = new mditor(ele_textarea);