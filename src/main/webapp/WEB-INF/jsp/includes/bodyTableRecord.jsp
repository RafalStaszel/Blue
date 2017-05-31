<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
    <title>Data Intel</title>
</head>
<body>
<div>
    <img class="dataTableExample" src="resources/images/logo.jpg">
</div>
<table id="example" class="display" cellspacing="0" width="100%" style="overflow-x:auto">
    <thead>
    <tr>
        <th>Lp</th>


        <th>Nr umowy</th>


        <th>System</th>


        <th>Od</th>

        <th>Do</th>


        <th>Zysk</th>


        <th>Cykl</th>


        <th>Aktywna</th>


    </tr>


    </thead>


</table>


</body>
</html>
<script type="text/javascript">
    $(document).ready(function () {
        var data = eval('${recordList}');
        var table = $('#example').DataTable({
            "aaData": data,
            "aoColumns": [
                {"mData": "id"},
                {"mData": "nrTrade"},
                {"mData": "system"},
                {"mData": "fromTime"},
                {"mData": "toTime"},
                {"mData": "income"},
                {"mData": "scale"},
                {"mData": "active"}
            ],
            "paging": true
        });
    });
</script>

