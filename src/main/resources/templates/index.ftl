<#import "parts/common.ftl" as c>

<@c.page>
<div class="form-row">
    <div class="form-group col-md-6">
        <form method="get" action="/" class="form-inline">
            <input type="text" name="filter" class="form-control" value="${filter?ifExists}" placeholder="Номер группы">
            <button type="submit" class="btn btn-color ml-2">Найти</button>
        </form>
    </div>
</div>
    <#list timesheets as timesheet>
    <div class="card mb-3 mt-3">
        <div class="card-header">
        <#if timesheet.day??>${timesheet.day}<#else></#if>
        </div>
        <div class="card-body">
            <p class="card-text">
                8:00 - 9:35
                <strong>${timesheet.firstLessonName?ifExists}</strong>
                ${timesheet.firstClassroom?ifExists} ${" ауд."}
                ${timesheet.firstTeacherName?ifExists}
            </p>
            <p class="card-text">
                9:45 - 11:20
                <strong>${timesheet.secondLessonName?ifExists}</strong>
                ${timesheet.secondClassroom?ifExists} ${" ауд."}
                ${timesheet.secondTeacherName?ifExists}
            </p>
            <p class="card-text">
                11:30 - 13:05
                <strong>${timesheet.therdLessonName?ifExists}</strong>
                ${timesheet.therdClassroom?ifExists} ${" ауд."}
                ${timesheet.therdTeacherName?ifExists}
            </p>
            <p class="card-text">
                13:45 - 15:20
                <strong>${timesheet.forthLessonName?ifExists}</strong>
                ${timesheet.forthClassroom?ifExists} ${" ауд."}
                ${timesheet.forthTeacherName?ifExists}
            </p>
            <p class="card-text">
                15:30 - 17:05
                <strong>${timesheet.sixthLessonName?ifExists}</strong>
                ${timesheet.sixthClassroom?ifExists} ${" ауд."}
                ${timesheet.sixthTeacherName?ifExists}
            </p>
        </div>
    </div>
    <#else>
    Расписание не найдено
    </#list>
</@c.page>
