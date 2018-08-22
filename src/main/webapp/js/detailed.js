$(document).ready(function () {
    $('.button-rounded').on('click',function () {
        var aa=$(this).parent().parent();

        var title=aa.find('h3').text();

        var content=aa.find('.main_article_content').text();

        sessionStorage.setItem("title",title);
        sessionStorage.setItem("content",content);

        })
})