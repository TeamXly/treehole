$(document).ready(function() {
    $('#sideMenu').sideToggle({
        moving: '#sideMenuContainer',
        direction: 'right'
    });
    /*
    *
    * */

    $('.main_article_input').each(function () {
        var $this=$(this);
        console.log($this.val());

        if($this.val()=='true'){
            $this.next().find('span').prepend("<img src='images/精品.png'/>");
        }
    })

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
        var ff=$this.parent().next().find('input');

        console.log(ff.val());

        $.ajax({
            url:'deletepost',
            type:'post',
            datatype:"json",
            data:{
                "post.postid":ff.val()
            },
            success:function f() {
                $this.parent().parent().remove();
            }
        })
    });

    /*
    *   添加精品标志
    * */
});

// $('.xiang').on('click',function () {
//     var $this=$(this);
//     var input_postid=$this.parent().parent().parent().find('input').val();
//     console.log(input_postid);
//     // $('form').submit();
// })

