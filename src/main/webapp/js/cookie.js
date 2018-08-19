$(function () {
    var username=$.cookie('username');
    console.log(username);
    if(username != null){
        $('.deng').hide();
        $('.welcome').show();
        $(".quit").show();
        $('.welcome a').html(username);
    }
    $(".quit").on("click",function () {
        $.cookie('username', '',{ expires: -1 });
        $('.deng').show();
        $('.welcome').hide();
        $('.quit').hide();
    });
});
