$(document).ready(function () {
    $('.button-rounded').on('click',function () {
        var aa=$(this).parent().parent();

        var title=aa.find('h3').text();

        var content=aa.find('.main_article_content').text();

        var postid=aa.find('.input_postid').val();

        var input_isboutique=aa.find('.input_isboutique').val();

        sessionStorage.setItem("title",title);
        sessionStorage.setItem("content",content);
        sessionStorage.setItem("postid",postid);
        sessionStorage.setItem("input_isboutique",input_isboutique);

        })
})