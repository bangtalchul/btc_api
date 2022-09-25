<template>
  <FullCalendar :options="calendarOptions" />
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
        initialView: "timeGridWeek",
        scrollTime: "09:00:00",
        slotMinTime: "09:00:00",
        slotEventOverlap: false,
        allDaySlot: false,
        headerToolbar: {
          left: "dayGridMonth,timeGridWeek,timeGridDay",
          center: "title",
          end: "prev,next",
        },
        events: [
          {
            id: "E1",
            title: "모모게임" + "손수현 외 5명",
            //date: "2022-09-24",
            start: "2022-09-25T09:00:00",
            end: "2022-09-25T11:00:00",
            backgroundColor: "gray",
            description: "모모게임\n" + "손수현 외5명",
            url: "http://localhost:8080/reservation",
          },
          { title: "event 2", date: "2022-09-19" },
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
