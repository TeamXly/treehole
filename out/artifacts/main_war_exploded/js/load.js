$(".load-more a").on('click',function(){

    var $this = $(this);

    $this.text('正在加载...');//innerText

    this.laodStatus = false;

    //文档碎片
    var _document = document.createDocumentFragment();//

    $(_document).load('/load-p1.html .article-list li',function(_html){

        $this.text('加载更多');
        $('.article-list').append(_document);
    });
    return false;
});

var oBtn = document.querySelector(".nav-switch"),
    oView = document.querySelector(".root-view");

oBtn.onclick = function() {

    this.openStatu = !this.openStatu;

    (this.openStatu)?oView.classList.add('nav-open'):oView.classList.remove('nav-open')
};

$(".deng").on("click",function() {
    $("#box").toggle(300);
    return false;
});

$(".logo").on("click",function() {
    return false;
});


$(".qu").on("click",function() {
    $("#box").hide(300);
    return false;
});


$(".zu").on("click",function() {
    $("#box").hide(300);
});


$(".jia1").one("click",function() {
    var $this = $(this);
    var ff = $this.parent(),
        $input = ff.find("input");
    var postid = $input.val();
    console.log(postid);
    var $b = $this.find("b");
    var num = parseInt($b.text()) || 0;
    $b.val(num+1);
    var id = $b.val();
    $b.text($b.val());

    $.ajax({
        url:'like',
        type:'post',
        datatype: "json",
        data:
        {"id":id,
        "postid":postid
        },
        success:function(data){
            console.log(data);
        }
    });
    return false;
});

$(".jia2").one("click",function() {
    var $this = $(this);
    var ff = $this.parent(),
        $input = ff.find("input");
    var postid = $input.val();
    console.log(postid);

    var $b = $this.find("b");
    var num = parseInt($b.text()) || 0;
    $b.val(num+1);
    var id = $b.val();
    $b.text($b.val());

    $.ajax({
        url:'dislike',
        type:'post',
        datatype: "json",
        data:
            {"id":id,
             "postid":postid
            },
        success:function(data){
            console.log(data);
        }
    });
    return false;
});








$(".fenX").hover(function() {
    var $this = $(this),
        fen = $this.find(".fen");
    fen.stop().slideDown(300);
    return false;
},function() {
    var $this = $(this),
        fen = $this.find(".fen");
    fen.stop().slideUp(300);
    return false;
});


$(".play").on("click",function dian(){
    var $audio = $("#audio")[0];
    setInterval(myanimate,13);
    if ($audio.paused){ /*如果已经暂停*/
        $audio.play(); /*播放*/
        $(this).removeClass("play");
        $(this).addClass("pause");
        $(".pic").addClass("rot");
        $(".title").addClass("tit");
    }else {
        $audio.pause();/*暂停*/
        $(this).addClass("play");
        $(this).removeClass("pause");
        $(".pic").removeClass("rot");
        $(".title").removeClass("tit");
    }
});

//		function title() {
//			$(".title").animate({left:'+=50px'},1000);
//        }


function myanimate(){
    var $tit = $(".tit"),
        $title = $(".title");
    var $left = $title.position().left;
    $tit.css({left:$left-0.2});
    if($left<10){
        $tit.css({left:300});
    }
}

var arrMusic = [
    {
        src : "mp3/1.mp3",
        title : "刚好遇见你",
        gsrc : "images/g1.jpg"
    },
    {
        src : "mp3/2.mp3",
        title : "我害怕",
        gsrc : "images/g2.jpg"
    },
    {
        src : "mp3/3.mp3",
        title : "爱就一个字",
        gsrc : "images/g3.jpg"
    },
    {
        src : "mp3/4.mp3",
        title : "许多年以后",
        gsrc : "images/g4.jpg"
    },
    {
        src : "mp3/5.mp3",
        title : "违章动物",
        gsrc : "images/g5.jpg"
    }
];


var n=0;
$(".next").click(function () {
    n++;
    if(n>4)n=0;
    music(n);
    // console.log($(".title").text(arrMusic[n].title));
});
$(".prev").click(function () {
    n--;
    if(n<1)n=4;
    music(n);
});
function music(n){
    var $audio = $("#audio"),
        $title = $(".title");
    var $img = $(".img");
    $audio.attr("src",arrMusic[n].src);
    $title.text(arrMusic[n].title);
    $img.attr("src",arrMusic[n].gsrc);
    if($("#fang").prop("className") == "pause"){
        $audio.get(0).play();
    }

}


document.on("click",function f() {
    var $jinPi = $(".jinPi");
    var $jinP = $(".jinP");
    var jinpi = $jinPi.val();
    console.log("这是ft"+jinpi);
    if(jinpi){
        $jinP.css({
            display: block
        })
    }
});




















