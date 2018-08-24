$(document).ready(function() {
    $('#sideMenu').sideToggle({
        moving: '#sideMenuContainer',
        direction: 'right'
    });

    /*
    *   用户名显示
    * */
    var username=$.cookie('username');
    if(username!=null){
        $('.Person_Center_Username').hide();
        $('.Person_Center_Cookie').show();
        $('.Person_Center_Cookie').html(username);
    }
    /*
    * 获取隐藏表单的值
    * */

    $('.button_Center_Delete').on('click',function (event) {
        event.stopPropagation();
        var $this=$(this);
        var ff=$this.next().find('input');

        console.log(ff.val());

        $.ajax({
            url:'deletepost',
            type:'post',
            datatype:"json",
            data:{
                "post.postid":ff.val()
            },
            success:function f() {
                $this.parent().remove();
            }
        })
    })
});

// $('.xiang').on('click',function () {
//     var $this=$(this);
//     var input_postid=$this.parent().parent().parent().find('input').val();
//     console.log(input_postid);
//     // $('form').submit();
// })

