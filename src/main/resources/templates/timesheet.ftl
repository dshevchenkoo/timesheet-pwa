<#import "parts/common.ftl" as c>

<@c.page>
<div class="form-row">
    <div class="form-group col-md-6">
        <form method="get" action="/timesheet" class="form-inline">
            <input type="text" name="filter" class="form-control" value="${filter?ifExists}" placeholder="Номер группы">
            <button type="submit" class="btn btn-primary ml-2">Найти</button>
        </form>
    </div>
</div>
<a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
    Добавить новое расписание
</a>
<div class="collapse" id="collapseExample">
    <div class="form-group mt-3">
        <form method="post" enctype="multipart/form-data">
            <div class="form-group">
                <input type="text" class="form-control" name="numberGroup" placeholder="Введите номер группы" />
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="day" placeholder="ПН, ВТ, СР, ...">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="firstLessonName" placeholder="Название первого предмета">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="firstTeacherName" placeholder="Латыпов И.А.">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="firstClassroom" placeholder="214">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="secondLessonName" placeholder="Название второго предмета">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="secondTeacherName" placeholder="Латыпов И.А.">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="secondClassroom" placeholder="214">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="therdLessonName" placeholder="Название третьего предмета">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="therdTeacherName" placeholder="Латыпов И.А.">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="therdClassroom" placeholder="214">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="forthLessonName" placeholder="Название четвертого предмета">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="forthTeacherName" placeholder="Латыпов И.А.">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="forthClassroom" placeholder="214">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="fifthLessonName" placeholder="Название пятого предмета">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="fifthTeacherName" placeholder="Латыпов И.А.">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="fifthClassroom" placeholder="214">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="sixthLessonName" placeholder="Название шестого предмета">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="sixthTeacherName" placeholder="Латыпов И.А.">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="sixthClassroom" placeholder="214">
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
        </form>
    </div>
</div>

    <#list timesheets as timesheet>
    <div class="card mb-3 mt-3">
        <div class="card-header">
        <#if timesheet.day??>
            ${timesheet.day}
        </#if>
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