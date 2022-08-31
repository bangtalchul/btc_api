<template>
  <section class="mt-1">
    <div class="flex justify-center">
      <div class="w-full">
        <vue-horizontal class="horizontal">
          <div class="item" v-for="item in items" :key="item.title">
            <div class="card">
              <div
                class="image"
                :style="{ background: `url(${item.image})` }"
              ></div>
              <div class="content">
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

                <div class="date">테마정보수정</div>
              </div>
            </div>
          </div>
        </vue-horizontal>

        <!-- <vue-horizontal class="horizontal">
          <div class="item" v-for="item in items" :key="item.title">
            <div class="card border border-gray-200 m-1 rounded-md h-80">
              <div>
                <img class="w-full object-cover border h-30" :src="item.image" />
              </div>
              <div class="text-left w-24">
                <div class="flex">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    fill="none"
                    viewBox="0 0 24 24"
                    stroke-width="1.5"
                    stroke="currentColor"
                    class="w-6 h-6"
                  >
                    <path
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      d="M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25H12"
                    />
                  </svg>
                  <div class="name ml-1">
                    <h2 class="font-bold text-gray-600">
                      {{ item.title }}
                    </h2>
                  </div>
                </div>
                <p class="">
                  {{ item.content }}
                </p>
              </div>
  
              <div class="date">
                  <p>1 week ago</p></div> 
            </div>
          </div>
        </vue-horizontal> -->
      </div>
    </div>

    <!-- <section>
      <div class="flex">
        <div class="w-2/12 flex items-center">
          <div class="w-full text-right">
            <button
              id="prev"
              class="p-2 rounded-full border border-gray-100 shadow-lg bg-wight mr-5"
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                viewBox="0 0 24 24"
                fill="currentColor"
                class="w-5 h-5"
              >
                <path
                  fill-rule="evenodd"
                  d="M13.28 3.97a.75.75 0 010 1.06L6.31 12l6.97 6.97a.75.75 0 11-1.06 1.06l-7.5-7.5a.75.75 0 010-1.06l7.5-7.5a.75.75 0 011.06 0zm6 0a.75.75 0 010 1.06L12.31 12l6.97 6.97a.75.75 0 11-1.06 1.06l-7.5-7.5a.75.75 0 010-1.06l7.5-7.5a.75.75 0 011.06 0z"
                  clip-rule="evenodd"
                />
              </svg>
            </button>
          </div>
        </div>
        <div id="sliderContainer" class="w-10/12 overflow-hidden">
          <ul id="slider" class="flex w-full border border-red-500">
            <li class="p-5">
              <div class="border rounded-lg p-5 h-full">
                <img
                  class="h-40 w-full object-cover rounded-md border"
                  src="../assets/logo.png"
                />
                <h2 class="mt-2 text-2xl font-bold text-gray-700">something1</h2>
                <p class="mt-2 text-gray-500">asdfasdfasdfksjhkdshafljkh</p>
              </div>
            </li>
            <li class="p-5">
              <div class="border rounded-lg p-5 h-full">
                <img
                  class="h-40 w-full object-cover rounded-md border"
                  src="../assets/logo.png"
                />
                <h2 class="mt-2 text-2xl font-bold text-gray-700">something2</h2>
                <p class="mt-2 text-gray-500">asdfasdfasdfksjhkdshafljkh</p>
              </div>
            </li>
            <li class="p-5">
              <div class="border rounded-lg p-5 h-full">
                <img
                  class="h-40 w-full object-cover rounded-md border"
                  src="../assets/logo.png"
                />
                <h2 class="mt-2 text-2xl font-bold text-gray-700">something3</h2>
                <p class="mt-2 text-gray-500">asdfasdfasdfksjhkdshafljkh</p>
              </div>
            </li>
            <li class="p-5">
              <div class="border rounded-lg p-5 h-full">
                <img
                  class="h-40 w-full object-cover rounded-md border"
                  src="../assets/logo.png"
                />
                <h2 class="mt-2 text-2xl font-bold text-gray-700">something4</h2>
                <p class="mt-2 text-gray-500">asdfasdfasdfksjhkdshafljkh</p>
              </div>
            </li>
            <li class="p-5">
              <div class="border rounded-lg p-5 h-full">
                <img
                  class="h-40 w-full object-cover rounded-md border"
                  src="../assets/logo.png"
                />
                <h2 class="mt-2 text-2xl font-bold text-gray-700">something5</h2>
                <p class="mt-2 text-gray-500">asdfasdfasdfksjhkdshafljkh</p>
              </div>
            </li>
            <li class="p-5">
              <div class="border rounded-lg p-5 h-full">
                <img
                  class="h-40 w-full object-cover rounded-md border"
                  src="../assets/logo.png"
                />
                <h2 class="mt-2 text-2xl font-bold text-gray-700">something6</h2>
                <p class="mt-2 text-gray-500">asdfasdfasdfksjhkdshafljkh</p>
              </div>
            </li>
            <li class="p-5">
              <div class="border rounded-lg p-5 h-full">
                <img
                  class="h-40 w-full object-cover rounded-md border"
                  src="../assets/logo.png"
                />
                <h2 class="mt-2 text-2xl font-bold text-gray-700">something7</h2>
                <p class="mt-2 text-gray-500">asdfasdfasdfksjhkdshafljkh</p>
              </div>
            </li>
            <li class="p-5">
              <div class="border rounded-lg p-5 h-full">
                <img
                  class="h-40 w-full object-cover rounded-md border"
                  src="../assets/logo.png"
                />
                <h2 class="mt-2 text-2xl font-bold text-gray-700">something8</h2>
                <p class="mt-2 text-gray-500">asdfasdfasdfksjhkdshafljkh</p>
              </div>
            </li>
          </ul>
        </div>
        <div class="w-2/12 flex items-center">
          <div class="w-full text-left">
            <button
              id="next"
              class="p-2 rounded-full border border-gray-100 shadow-lg bg-wight ml-5"
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                viewBox="0 0 24 24"
                fill="currentColor"
                class="w-6 h-6"
              >
                <path
                  fill-rule="evenodd"
                  d="M4.72 3.97a.75.75 0 011.06 0l7.5 7.5a.75.75 0 010 1.06l-7.5 7.5a.75.75 0 01-1.06-1.06L11.69 12 4.72 5.03a.75.75 0 010-1.06zm6 0a.75.75 0 011.06 0l7.5 7.5a.75.75 0 010 1.06l-7.5 7.5a.75.75 0 11-1.06-1.06L17.69 12l-6.97-6.97a.75.75 0 010-1.06z"
                  clip-rule="evenodd"
                />
              </svg>
            </button>
          </div>
        </div>
      </div>
    </section> -->
    <!-- <div class="home">
      <img alt="Vue logo" src="../assets/logo.png" />
      <HelloWorld msg="Welcome to Your Vue.js App" />
    </div> -->
  </section>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from "@/components/HelloWorld.vue";
import VueHorizontal from "vue-horizontal";
export default {
  name: "Home",
  components: {
    // HelloWorld,
    VueHorizontal,
  },
  data() {
    return {
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
          title: "test5",
          content: "content test",
          image: require("../../src/assets/logo.png"),
        },
        {
          title: "test5",
          content: "content test",
          image: require("../../src/assets/logo.png"),
        },
      ],
    };
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
