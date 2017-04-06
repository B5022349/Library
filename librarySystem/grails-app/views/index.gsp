<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Library System</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to our Library System</h1>

			<div class="row">

				<asset:image src="library.jpg"/>
			</div>

        </section>
    </div>
<div id="controllers" role="navigation">
	<h2> Available Controllers:</h2>
	<ul>
		<g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
			<li class="controller">
				<g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
			</li>
		</g:each>
	</ul>
</div>

</body>
</html>
