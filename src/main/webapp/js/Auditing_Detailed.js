$(document).ready(function() {
    $('#sideMenu').sideToggle({
        moving: '#sideMenuContainer',
        direction: 'right'
    });

    var postid=$('.button_postid').val();
    var isboutique=$('.button_isboutique').val();

    /*删除功能*/
    $('.button_delete_Auditing').on('click',function (e) {
        e.stopPropagation();

        $.ajax({
            url:'auditingdeletepost',
            type:'post',
            datatype:"json",
            data:{
                "post.postid":postid
            },
            success:function f() {
                alert('删除成功');
                location.href='Auditing';
            }
        })
    })
    /*
    * 加精
    * */
    $('.button_delete_isboutique').on('click',function (e) {
        e.stopPropagation();

        $.ajax({
            url:'addfine',
            type:'post',
            datatype:"json",
            data:{
                "post.postid":postid,
                "post.isboutique":isboutique
            },
            success:function f() {
                alert('加入精品/取消精品成功');
                location.href="Auditing";
            }
        })
    })
});