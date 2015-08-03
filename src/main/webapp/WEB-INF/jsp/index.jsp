<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp"%>

<div class="row">
    <div class="col-xs-12">
        <div id="stigmod-indexpage">
            <h1 class="text-center">Welcome to</h1>
            <h1 class="text-center"><img src="/public/src/img/stigmod_logo_op.png" alt="stigmod-logo"/> !</h1>
            <br /><br />
            <p class="text-center">Used for collaborative groups to create a conceptual model.</p>
            <p class="text-center">Based on UML 2.0 class diagram specifications and stigmergy theory.</p>
            <br />
            <div class="text-center"><a class="stigmod-a-nounderline" href="about">Learn more about <span class="stigmod-websitename">Stigmergic-Modeling</span></a></div>
            <br />
            <p class="text-center">
                <a class="btn btn-lg btn-primary" href="/workspacedemo" role="button">Try it now!</a>
                <a class="btn btn-lg btn-success" href="/reg" role="button">Sign up</a>
                <a class="btn btn-lg btn-default" href="/login" role="button">Sign in</a>
            </p>
        </div>
    </div>
</div>

<script src="/public/src/js/sea/sea.js"></script>
<script>
    seajs.config({
        paths: {
            'js': 'http://${host}:${port}/public/dist/js'
        }
    });
    seajs.use('js/app/index');
</script>

<%@ include file="footer.jsp"%>