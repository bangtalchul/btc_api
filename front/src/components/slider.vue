<template>
  <section class="mt-1">
    <div class="flex justify-center">
      <div class="w-full">
        <vue-horizontal class="horizontal">
          <div class="item" v-for="item in items" :key="item.title">
            <div class="card" @click="toggleModal()">
              <div
                class="image"
                :style="{ background: `url(${item.image})` }"
              ></div>
              <div class="content bg-white">
                <div>
                  <div class="brand">
                    <svg class="icon" viewBox="0 0 24 24">
                      <path
                        d="M19,5v14H5V5H19 M19,3H5C3.9,3,3,3.9,3,5v14c0,1.1,0.9,2,2,2h14c1.1,0,2-0.9,2-2V5C21,3.9,20.1,3,19,3L19,3z"
                      />
                      <path
                        d="M14,17H7v-2h7V17z M17,13H7v-2h10V13z M17,9H7V7h10V9z"
                      />
                    </svg>
                    <div class="name">{{ item.title }}</div>
                  </div>

                  <div class="title">{{ item.content }}</div>
                </div>

                <div class="date" v-on:click="reviseRoom(item.title)">
                  테마정보수정
                </div>
              </div>
            </div>
          </div>
        </vue-horizontal>
      </div>
    </div>

    <div>
      <div
        v-if="OpenModal"
        class="overflow-x-hidden overflow-y-auto fixed inset-0 z-50 outline-none focus:outline-none justify-center items-center flex"
      >
        <div class="relative w-auto my-6 mx-auto max-w-3xl">
          <!--content-->
          <div
            class="border-0 rounded-lg shadow-lg relative flex flex-col w-full bg-white outline-none focus:outline-none"
          >
            <!--header-->
            <div
              class="flex items-start justify-between p-5 border-b border-solid border-slate-200 rounded-t"
            >
              <h3 class="text-xl font-semibold">모모게임</h3>
              <div class="flex">
                <div v-for="i in 1" :key="i">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    fill="none"
                    viewBox="0 0 24 24"
                    strokeWidth="{1}"
                    stroke="currentColor"
                    className="w-2 h-2"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      d="M11.48 3.499a.562.562 0 011.04 0l2.125 5.111a.563.563 0 00.475.345l5.518.442c.499.04.701.663.321.988l-4.204 3.602a.563.563 0 00-.182.557l1.285 5.385a.562.562 0 01-.84.61l-4.725-2.885a.563.563 0 00-.586 0L6.982 20.54a.562.562 0 01-.84-.61l1.285-5.386a.562.562 0 00-.182-.557l-4.204-3.602a.563.563 0 01.321-.988l5.518-.442a.563.563 0 00.475-.345L11.48 3.5z"
                    />
                  </svg>
                </div>
              </div>
              <button
                class="p-1 ml-auto bg-transparent border-0 text-black opacity-5 float-right text-3xl leading-none font-semibold outline-none focus:outline-none"
                v-on:click="toggleModal()"
              >
                <span
                  class="bg-transparent text-black opacity-5 h-6 w-6 text-2xl block outline-none focus:outline-none"
                >
                  ×
                </span>
              </button>
            </div>
            <!--body-->
            <div class="flex p-6">
              <div class="w-1/3">
                <img
                  src="../assets/escapemain.jpg"
                  class="object-contain h-100 w-100"
                />
                <div>난이도</div>
              </div>
              <div class="w-2/3">asdhlaksjdhfalsfkdjhl</div>
            </div>
            <!--footer-->
            <div
              class="flex items-center justify-end p-6 border-t border-solid border-slate-200 rounded-b"
            >
              <button
                class="bg-MainViolet text-white active:bg-indigo-600 text-xs font-bold uppercase px-5 py-2 rounded outline-none focus:outline-none mr-1 mb-1 ease-linear transition-all duration-150"
                type="button"
                v-on:click="toggleModal()"
              >
                닫기
              </button>
              <button
                class="bg-MainViolet text-white active:bg-indigo-600 text-xs font-bold uppercase px-5 py-2 rounded outline-none focus:outline-none mr-1 mb-1 ease-linear transition-all duration-150"
                type="button"
                v-on:click="reviseTheme()"
              >
                정보수정하기
              </button>
            </div>
          </div>
        </div>
      </div>
      <div
        v-if="OpenModal"
        class="opacity-25 fixed inset-0 z-40 bg-black"
      ></div>
    </div>

    <RoomDetailModal :modal="OpenModal"></RoomDetailModal>
  </section>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from "@/components/HelloWorld.vue";
import VueHorizontal from "vue-horizontal";
import RoomDetailModal from "./RoomDetailModal.vue";

export default {
  name: "Home",
  components: {
    // HelloWorld,
    VueHorizontal,
    RoomDetailModal,
  },
  data() {
    return {
      OpenModal: false,
      room: {
        level: 3,
      },
      items: [
        {
          title: "test1",
          content:
            "content test jadlkfajdl;fjaldskfjalkdfj ad;lfkjadlkja sldkjfsldkfj ",
          image: require("../../src/assets/escapemain.jpg"),
        },
        {
          title: "test2",
          content: "content test",
          image: require("../../src/assets/logo.png"),
        },
        {
          title: "test3",
          content: "content test",
          image: require("../../src/assets/escapemain.jpg"),
        },
        {
          title: "test4",
          content: "content test",
          image: require("../../src/assets/logo.png"),
        },
        {
          title: "test5",
          content: "content test",
          image: require("../../src/assets/logo.png"),
        },
        {
          title: "test6",
          content: "content test",
          image: require("../../src/assets/logo.png"),
        },
        {
          title: "test7",
          content: "content test",
          image: require("../../src/assets/logo.png"),
        },
      ],
    };
  },
  methods: {
    detailRoom(roompk) {
      this.$router.push({ path: "DerailInfo", params: { room: roompk } });
    },
    reviseRoom(roompk) {
      this.$router.push({ path: "AddRoom", params: { room: roompk } });
    },
    toggleModal() {
      this.OpenModal = !this.OpenModal;
    },
    reviseTheme() {
      this.$router.push({
        path: "add",
      });
    },
  },
};
</script>

<style scoped>
.card {
  border-radius: 6px;
  overflow: hidden;
  border: 1px solid #e2e8f0;
  height: 100%;
  display: flex;
  flex-direction: column;
}

.image {
  background-position: center !important;
  background-size: cover !important;
  background-repeat: no-repeat !important;
  padding-top: 50%;
}

.content {
  padding: 12px 20px;
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.brand {
  display: flex;
  align-items: center;
  color: #333333;
}

.brand .icon {
  flex-shrink: 0;
  height: 20px;
  width: 20px;
  fill: currentColor;
}

.brand .name {
  margin-left: 4px;
  font-size: 12px;
  font-weight: 700;
  line-height: 1.5;
}

.title {
  font-size: 14px;
  font-weight: 700;
  line-height: 1.6;
  margin-top: 8px;
  margin-bottom: 8px;
}

.date {
  font-size: 12px;
  font-weight: 500;
  line-height: 1.5;
}
</style>

<!-- Parent CSS (Container) -->
<style scoped>
.header {
  margin-bottom: 16px;
}

main {
  padding: 24px;
}

@media (min-width: 768px) {
  main {
    padding: 48px;
  }
}
</style>

<!-- Responsive Breakpoints -->
<style scoped>
.horizontal {
  --count: 1;
  --gap: 16px;
  --margin: 24px;
}

@media (min-width: 640px) {
  .horizontal {
    --count: 2;
  }
}

@media (min-width: 768px) {
  .horizontal {
    --count: 3;
    --margin: 0;
  }
}

@media (min-width: 1024px) {
  .horizontal {
    --count: 3;
  }
}

@media (min-width: 1280px) {
  .horizontal {
    --gap: 24px;
    --count: 4;
  }
}
</style>

<!--
    ## Responsive Logic
    The margin removes the padding from the parent container and add it into vue-horizontal.
    If the gap is less than margin, this causes overflow to show and peeks into the next content for better UX.
    You can replace this section entirely for basic responsive CSS logic if you don't want this "peeking" experience
    for the mobile web.
    Note that this responsive logic is hyper sensitive to your design choices, it's not a one size fit all solution.
    var() has only 95% cross browser compatibility, you should convert it to fixed values.
    
    There are 2 set of logic:
    0-768 for peeking optimized for touch scrolling.
    >768 for navigation via buttons for desktop/laptop users.
    -->
<style scoped>
@media (max-width: 767.98px) {
  .item {
    width: calc((100% - (var(--margin) * 2) + var(--gap)) / var(--count));
    padding: 0 calc(var(--gap) / 2);
  }

  .item:first-child {
    width: calc(
      (100% - (var(--margin) * 2) + var(--gap)) / var(--count) + var(--margin) -
        (var(--gap) / 2)
    );
    padding-left: var(--margin);
  }

  .item:last-child {
    width: calc(
      (100% - (var(--margin) * 2) + var(--gap)) / var(--count) + var(--margin) -
        (var(--gap) / 2)
    );
    padding-right: var(--margin);
  }

  .item:only-child {
    width: calc(
      (100% - (var(--margin) * 2) + var(--gap)) / var(--count) + var(--margin) *
        2 - var(--gap)
    );
  }

  .horizontal {
    margin: 0 calc(var(--margin) * -1);
  }

  .horizontal >>> .v-hl-container {
    scroll-padding: 0 calc(var(--margin) - (var(--gap) / 2));
  }

  .horizontal >>> .v-hl-btn {
    display: none;
  }
}

@media (min-width: 768px) {
  .item {
    width: calc((100% - ((var(--count) - 1) * var(--gap))) / var(--count));
    margin-right: var(--gap);
  }
}
</style>
