$(function () {
    var username=$.cookie('username');
    if(username != null){
        $('.deng').hide();
        $('.welcome').show();
        $(".quit").show();
        $('.welcome a').html(username);
    }
    $(".quit").on("click",function () {
        $.cookie('username', '',{ expires: -1 });
        $.cookie('userid', '',{ expires: -1 });
        $('.deng').show();
        $('.welcome').hide();
        $('.quit').hide();
    });
});

//验证cooike跳转
$(".trial").on("click",function() {
    var userid=$.cookie('userid');
    if(userid == null){
        $(".tips").text("请先登录，再进行骚操作");
        $(".tips").stop().show(300,function () {
            $(".tips").delay(1500).hide(100);
            $("#box").delay(500).show(300);
        });
        return false;
    }else if(userid != 1){
        $(".tips").text("你没有权限,请更换账号");
        $(".tips").stop().show(300,function () {
            $(".tips").delay(1500).hide(100);
            $(".quit").click();
            $("#box").delay(500).show(300);
        });
        return false;
    }
    else {
        return true;
    }
});

$(".publish").on("click",function() {
        var userid=$.cookie('userid');
        if(userid == null){
            $(".tips").text("请先登录，再进行骚操作");
            $(".tips").stop().show(300,function () {
                $(".tips").delay(1500).hide(100);
                $("#box").delay(500).show(300);
            });
            return false;
        }else {
            return true;
        }
});
$(".personal").on("click",function() {
        var userid=$.cookie('userid');
        if(userid == null){
            $(".tips").text("请先登录，再进行骚操作");
            $(".tips").stop().show(300,function () {
                $(".tips").delay(1500).hide(100);
                $("#box").delay(500).show(300);
            });
            return false;
        }else{
            return true;
        }
});