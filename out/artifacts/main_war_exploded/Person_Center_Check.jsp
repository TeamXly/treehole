<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>个人中心 查看</title>
	<link href="images/shu.png" rel="shortcut icon" />
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="css/style1.css">
	<link href="css/buttons.css" rel="stylesheet">

</head>

<body>
	<nav>
		<a href="post_center" id="userPLink">
			<span class="fa fa-user"></span>
			<span class="Person_Center_Username">名字</span>
			<span class="Person_Center_Cookie"></span>
		</a>
		<div id="sideMenu">
			<span class="fa fa-navicon" id="sideMenuClosed"></span>
		</div>
	</nav>

	<div id="sideMenuContainer">
		<h2>个人中心</h2>
		<a href="post_center" title="查看发言 "><span class="fa fa-bolt"></span></a>
		<a href="Person_Center_publish.jsp" title="发布"><span class="fa fa-exclamation-circle"></span></a>
        <a href="post" title="返回首页"><span class="fa fa-home"></span></a>
	</div>

	<!--中间-->

	<div class="main">
		<h2 class="main_title">
			个人中心
		</h2>

        <s:iterator value="post_center">
		<div class="main_article">
			<input class="main_article_input" style="display: none" value="<s:property value="isboutique"/>">
			<h3><span><s:property value="title"/></span></h3>
			<div class="main_article_content">
				<s:property value="text"/>
			</div>

			<div class="main_delete_button">
				<button  class="button button-rounded button-tiny button_Center_Delete" style="margin:5px;width: 80px;">
				删除
				</button>
			</div>

            <form action="UserWatchDetailed" method="post" id="form1">
                <input class="input_postid" style="display: none" name="comment.c_postid"  type="text" value="<s:property value="postid"/>">
					<div class="main_article_button" >
							<input  class="button button-rounded button-tiny" type="submit" value="查看详情">
					</div>
            </form>
        </div>
        </s:iterator>
	</div>
	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src='js/velocity.min.js'></script>
	<script src='js/sideToggleExtended.js'></script>
	<script src="js/jquery.cookie.js"></script>
	<script src="js/detailed.js"></script>
	<script src="js/Person_Center_Check.js"></script>
	<script>
/*        $(document).ready(function () {
            $('.main_article_input').each(function () {
                var $this=$(this);
                console.log($this.val());

                if($this.val()=='true'){
                    $this.next().find('span').prepend("<img src='images/精品.png'/>");
				}
            })
        })*/
	</script>

</body>
</html>
