$(document).ready(function() {
    $('#sideMenu').sideToggle({
        moving: '#sideMenuContainer',
        direction: 'right'
    });

    $('.main_article_input').each(function () {
        var $this=$(this);
        console.log($this.val());

        if($this.val()=='true'){
            console.log("成功");
            $this.next().find('span').prepend("<img src='images/精品.png'/>");
        }
    })
});