<template>
  <div class="pb-12"><FullCalendar :options="calendarOptions" /></div>
</template>

<script>
import FullCalendar from "@fullcalendar/vue";
import timeGridPlugin from "@fullcalendar/timegrid";
import dayGridPlugin from "@fullcalendar/daygrid";
export default {
  components: {
    FullCalendar, // make the <FullCalendar> tag available
  },
  data() {
    return {
      calendarOptions: {
        plugins: [timeGridPlugin, dayGridPlugin],
        // titleFormat: function (date) {
        //   // title 설정
        //   return date.date.year + "년 " + 9 + "월 " + 28 + "일";
        // },
        titleFormat: {
          year: "numeric",
          month: "long",
        },
        // dayHeaderContent: function (date) {
        //   let weekList = ["월", "화", "수", "목", "금", "토", "일"];
        //   return weekList[date.dow];
        // },
        // dayRender: function (date, cell) {
        //   var today = new Date();
        //   var end = new Date();
        //   end.setDate(today.getDate() + 7);

        //   if (date.getDate() === today.getDate()) {
        //     cell.css("background-color", "red");
        //   }

        //   if (date > today && date <= end) {
        //     cell.css("background-color", "yellow");
        //   }
        // },
        //hiddenDays: [5, 6, 7],
        resourceLabelText: "Room",
        resourceGroupField: "type",
        height: "auto",
        locale: "korea",
        initialView: "timeGridWeek",
        scrollTime: "09:00:00",
        slotMinTime: "09:00:00",
        //slotMaxTime: "23:00:00",
        slotEventOverlap: true,
        allDaySlot: false,
        headerToolbar: {
          left: "dayGridMonth,timeGridWeek,timeGridDay",
          //left: "timeGridWeek",
          center: "title",
          end: "prev,next",
        },
        events: [
          {
            id: "E1",
            title: "고문실",
            eventContent: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-29T13:00:00",
            end: "2022-09-29T14:00:00",
            backgroundColor: "#FDBA21",
            borderColor: "#FDBA21",

            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "고문실",
            eventContent: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-25T22:00:00",
            end: "2022-09-25T23:00:00",
            backgroundColor: "#FDBA21",
            borderColor: "#FDBA21",

            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "고문실",
            eventContent: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-29T19:00:00",
            end: "2022-09-29T20:00:00",
            backgroundColor: "#FDBA21",
            borderColor: "#FDBA21",

            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "타짜",
            eventContent: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-27T22:00:00",
            end: "2022-09-27T23:00:00",
            backgroundColor: "#F39C12",
            borderColor: "#F39C12",

            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "엘리베이터",
            eventContent: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-27T22:00:00",
            end: "2022-09-27T23:00:00",
            backgroundColor: "#58D68D",
            borderColor: "#58D68D",

            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "타짜",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-28T15:00:00",
            end: "2022-09-28T16:00:00",
            backgroundColor: "#F39C12",
            borderColor: "#F39C12",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "타짜",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-25T12:00:00",
            end: "2022-09-25T13:00:00",
            backgroundColor: "#F39C12",
            borderColor: "#F39C12",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "타짜",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-29T19:00:00",
            end: "2022-09-29T20:00:00",
            backgroundColor: "#F39C12",
            borderColor: "#F39C12",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "타짜",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-29T17:00:00",
            end: "2022-09-29T18:00:00",
            backgroundColor: "#F39C12",
            borderColor: "#F39C12",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "엘리베이터",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-28T17:00:00",
            end: "2022-09-28T18:00:00",
            backgroundColor: "#58D68D",
            borderColor: "#58D68D",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "엘리베이터",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-25T14:00:00",
            end: "2022-09-25T15:00:00",
            backgroundColor: "#58D68D",
            borderColor: "#58D68D",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "엘리베이터",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-27T19:00:00",
            end: "2022-09-27T20:00:00",
            backgroundColor: "#58D68D",
            borderColor: "#58D68D",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "엘리베이터",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-29T15:00:00",
            end: "2022-09-29T16:00:00",
            backgroundColor: "#58D68D",
            borderColor: "#58D68D",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "고문실",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-26T17:00:00",
            end: "2022-09-26T18:00:00",
            backgroundColor: "#FDBA21",
            borderColor: "#FDBA21",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "주차장",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-28T20:00:00",
            end: "2022-09-28T21:00:00",
            backgroundColor: "#2E86C1",
            borderColor: "#2E86C1",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          {
            id: "E1",
            title: "주차장",
            content: "손수현 외 6명",
            //date: "2022-09-24",
            start: "2022-09-29T20:00:00",
            end: "2022-09-29T21:00:00",
            backgroundColor: "#2E86C1",
            borderColor: "#2E86C1",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
        ],
      },
    };
  },
  methods: {
    test(e) {
      // this.$router.push({
      //   path: "reservation",
      // });
      alert(e);
      console.log(e);
    },
  },
};
</script>
<style scoped>
.fc-today {
  background: #f8f9fa !important;
}
</style>
