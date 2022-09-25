import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import Login from "../views/auth/Login.vue";
import AddRoom from "../views/rooms/AddRoom.vue";
import DetailInfo from "../views/rooms/DetailInfo.vue";
import NoneStoreInfo from "../components/NoneStoreInfo.vue";
import Reservation from "../components/Reservation.vue";
import Scheduler from "../components/Scheduler.vue";
import StoreSetInfo from "../components/StoreSetInfo.vue";
Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Login",
    component: Login,
  },
  {
    path: "/home",
    name: "Home",
    component: Home,
  },
  {
    path: "/rooms",
    name: "room",
    component: DetailInfo,
    children: [],
  },
  {
    path: "/add",
    name: "AddRoom",
    component: AddRoom,
    props: true,
  },
  {
    path: "/none",
    name: "None",
    component: NoneStoreInfo,
    props: true,
  },
  {
    path: "/reservation",
    name: "Reservation",
    component: Reservation,
    props: true,
  },
  {
    path: "/schedule",
    name: "Schedule",
    component: Scheduler,
    props: true,
  },
  {
    path: "/storeinfo",
    name: "storeinfo",
    component: StoreSetInfo,
    props: true,
  },
  {
    path: "/about",
    name: "About",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/About.vue"),
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
