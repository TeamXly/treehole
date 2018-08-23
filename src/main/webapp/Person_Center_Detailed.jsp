<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>查询 详细信息</title>
    <link href="images/shu.png" rel="shortcut icon" />
    <link rel="stylesheet" type="text/css" href="css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="css/demo.css">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style1.css">
    <link href="css/buttons.css" rel="stylesheet">
    <link rel="stylesheet" href="css/Auditing_detailed.css">

</head>

<body>
<nav>
    <a href="#" id="userPLink">
        <span class="fa fa-user"></span> 审核帖子
    </a>
    <div id="sideMenu">
        <span class="fa fa-navicon" id="sideMenuClosed"></span>
    </div>
</nav>

<div id="sideMenuContainer">
    <h2>个人中心</h2>
    <a href="post_center" title="查看帖子 "><span class="fa fa-bolt"></span></a>
    <a href="Person_Center_publish.jsp" title="发布 "><span class="fa fa-bolt"></span></a>
</div>

<!--中间-->

<div class="main">
    <h2 class="main_title">
        审核中心
    </h2>
    <div class="main_content_detailed">
        <div>
            <p id="content">

            </p>
        </div>
        <div class="main_content_button">
            <button class="button button-rounded button-tiny" style="width: 150px; height: 40px; margin: 10px 0px;">返回</button>
            <button class="button button-rounded button-tiny" style="width: 150px; height: 40px;margin: 10px 0px;">删除帖子</button>
            <button class="button button-rounded button-tiny" style="width: 150px; height: 40px;margin: 10px 0px;">加入精品</button>
        </div>
    </div>
</div>

<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src='js/velocity.min.js'></script>
<script src='js/sideToggleExtended.js'></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('#sideMenu').sideToggle({
            moving: '#sideMenuContainer',
            direction: 'right'
        });

        var content=sessionStorage.getItem("content");
        $('#content').html(content);

    });

</script>

</body>

</html>
