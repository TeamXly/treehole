<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script language = javascript>
    location.href='post';
</script>
<%--<!DOCTYPE html>--%>
<%--<html class="root-view">--%>
<%--<head>--%>
    <%--<meta charset="UTF-8">--%>
    <%--<base href="basePath">--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">--%>
    <%--<title>树洞——你的心情驿站</title>--%>
    <%--<link href="images/shu.png" rel="shortcut icon" />--%>
    <%--<link rel="stylesheet" type="text/css" href="css/style.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="css/media.css">--%>
<%--</head>--%>
<%--<body>--%>
<%--<!-- 头部 -->--%>
<%--<header class="header">--%>
    <%--<section class="header-top">--%>
        <%--<a href="" class="logo">--%>
            <%--<img src="images/shu.png" alt="">--%>
            <%--<span class="deng">登录</span>--%>
        <%--</a>--%>
        <%--<span class="welcome"><a href="Person_Center_Check.jsp">伤天害理</a>，欢迎你</span>--%>
        <%--<span class="quit">退出</span>--%>
        <%--<span class="nav-switch"></span>--%>
        <%--<nav class="nav">--%>
            <%--<ul>--%>
                <%--<li class="on">--%>
                    <%--<a href="">热门</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="">精华</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="">最新</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="">审帖</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="">发表</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="Person_Center_Check.jsp">个人中心</a>--%>
                <%--</li>--%>
            <%--</ul>--%>
        <%--</nav>--%>
    <%--</section>--%>
    <%--<section class="header-bg">--%>
        <%--<section class="self-introduce container">--%>
            <%--<p>树洞你的心灵驿站，让那些生活中不曾发出的声音，请把它留在这里</p>--%>
        <%--</section>--%>
    <%--</section>--%>
<%--</header>--%>

<%--<!-- 中部 -->--%>
<%--<main class="main container clearfix">--%>

    <%--<section class="article-view">--%>
        <%--<h2 class="article-title">--%>
            <%--Posts--%>
        <%--</h2>--%>

        <%--&lt;%&ndash;<s:iterator value="posts">&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<s:property value="publishedtime"/></br>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<s:property value="text"/></br>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<s:property value="tit"/></br>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<s:property value="text"/></br>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<s:property value="like"/></br>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<s:property value="dislike"/></br>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<s:property value="isboutique"/></br>&ndash;%&gt;&ndash;%&gt;--%>
            <%--&lt;%&ndash;&lt;%&ndash;<s:property value="userid"/></br>&ndash;%&gt;&ndash;%&gt;--%>
        <%--&lt;%&ndash;<div class="kuang">&ndash;%&gt;--%>
            <%--&lt;%&ndash;<ul class="article-list">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<li>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<a href="" class="article-item">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<h3><span>Time :&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<s:if test="publishedtime.length() > 15">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<s:property value="publishedtime.substring(0,14)"/>...&ndash;%&gt;--%>
                            <%--&lt;%&ndash;</s:if>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<s:else>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<s:property value="publishedtime"/>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;</s:else>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;</span><s:property value="title"/></h3>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<p><s:property value="text"/></p>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</a>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<li class="xia">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<div class="zan"><span class="jia1">👍 <b>0</b></span><span class="jia2">👎 <b>0</b></span>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<span class="comm-p">评论</span>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<span class="fenX">分享&ndash;%&gt;--%>
								<%--&lt;%&ndash;<div class="fen">&ndash;%&gt;--%>
									<%--&lt;%&ndash;<a href="">新浪微博</a>&ndash;%&gt;--%>
									<%--&lt;%&ndash;<a href="">QQ空间</a>&ndash;%&gt;--%>
									<%--&lt;%&ndash;<a href="">腾讯微博</a>&ndash;%&gt;--%>
								<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
							<%--&lt;%&ndash;</span>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<div class="comm">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<hr>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<ul class="list">&ndash;%&gt;--%>

                        <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<textarea name="" class="ping" cols="30" rows="10">请不要发表与本内容无关的评论，您有了账号就是有身份的人了，我们可认识您。</textarea>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<button class="fa">发表</button>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</s:iterator>&ndash;%&gt;--%>

        <%--<section class="load-more">--%>
            <%--<a href="">加载更多</a>--%>
        <%--</section>--%>
    <%--</section>--%>

    <%--<section class="right-column">--%>
        <%--<section class="column-item">--%>
            <%--<h3>Music</h3>--%>
            <%--<section class="friends">--%>
                <%--<div class="music">--%>
                    <%--<div class="pic"></div>--%>
                    <%--<div class="title tit">刚好遇见你</div>--%>
                    <%--<audio id="audio" src="mp3/1.mp3"></audio>--%>
                    <%--<div class="kong">--%>
                        <%--<span class="prev"></span>--%>
                        <%--<span class="play" id="fang"></span>--%>
                        <%--<span class="next"></span>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</section>--%>
        <%--</section>--%>
        <%--<section class=" column-item">--%>
            <%--<h3>Tags</h3>--%>
            <%--<section class="tags">--%>
                <%--<a href="">h5</a>--%>
                <%--<a href="">Css</a>--%>
                <%--<a href="">Js</a>--%>
                <%--<a href="">Json</a>--%>
                <%--<a href="">Ajax</a>--%>
            <%--</section>--%>
        <%--</section>--%>
        <%--<section class="column-item">--%>
            <%--<h3>About me</h3>--%>
            <%--<section class="about-me">--%>
                <%--<img src="images/cover.gif">--%>
                <%--<p>今日的努力，仅为昨日的吹的牛逼!!!</p>--%>
            <%--</section>--%>
        <%--</section>--%>
    <%--</section>--%>
<%--</main>--%>

<%--<footer class="footer">Tree hole on 2018</footer>--%>

<%--<div id="box">--%>
    <%--<div class="zu"><a href="register.jsp">注册</a></div>--%>
    <%--<div class="qu">X</div>--%>
    <%--<div class="box">--%>
        <%--<form class="reg-form" id="reg-form" method="post">--%>
            <%--<label class="form-item">--%>
                <%--<strong>--%>
                    <%--<img src="images/zh.png" alt="">--%>
                <%--</strong>--%>
                <%--<div>--%>
                    <%--<input type="text" name="user.phone" maxlength="11" placeholder="账号为手机号">--%>
                    <%--<i></i>--%>
                <%--</div>--%>
            <%--</label>--%>
            <%--<label class="form-item">--%>
                <%--<strong>--%>
                    <%--<img src="images/mm.png" alt="">--%>
                <%--</strong>--%>
                <%--<div>--%>
                    <%--<input type="password" name="user.password" maxlength="16" placeholder="密码8-16位">--%>
                    <%--<i></i>--%>
                <%--</div>--%>
            <%--</label>--%>
            <%--<label class="form-item">--%>
                <%--<div class="sub-btn">--%>
                    <%--<button>登录</button>--%>
                <%--</div>--%>
            <%--</label>--%>
        <%--</form>--%>
    <%--</div>--%>
<%--</div>--%>
<%--<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/1.11.1/jquery.js"></script>--%>
<%--<script type="text/javascript" src="js/biaodan.js"></script>--%>
<%--<script type="text/javascript" src="js/load.js"></script>--%>
<%--<script type="text/javascript" src="js/jquery.cookie.js"></script>--%>
<%--<script type="text/javascript" src="js/cookie.js"></script>--%>
<%--</body>--%>
<%--</html>--%>