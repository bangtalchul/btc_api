<template>
  <div>
    <div class="text-left">
      <p class="text-lg">예약상세</p>
    </div>
    <hr style="border: 1px solid black; background-color: black" />

    <div class="flex content-start flex-wrap">
      <div class="w-2/3 p-2">
        <div>
          <div class="flex">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              fill="none"
              viewBox="0 0 24 24"
              stroke-width="1.5"
              stroke="currentColor"
              class="w-5 h-5 mt-2.5"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                d="M15.75 6a3.75 3.75 0 11-7.5 0 3.75 3.75 0 017.5 0zM4.501 20.118a7.5 7.5 0 0114.998 0A17.933 17.933 0 0112 21.75c-2.676 0-5.216-.584-7.499-1.632z"
              />
            </svg>

            <div class="pt-2 pb-2 text-left">예약자</div>
          </div>
          <hr class="m-2" />

          <div class="flex items-center mb-4">
            <img
              class="w-10 h-10 rounded-full mr-4"
              src="../assets/team-2-800x800.jpg"
              alt="Avatar of Jonathan Reinink"
            />
            <div class="text-sm">
              <p class="text-gray-900 leading-none">손수현</p>
            </div>
          </div>
        </div>

        <div>
          <div class="flex">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              fill="none"
              viewBox="0 0 24 24"
              strokeWidth="1.5"
              stroke="currentColor"
              class="w-5 h-5 mt-2.5"
            >
              <path
                strokeLinecap="round"
                strokeLinejoin="round"
                d="M15 19.128a9.38 9.38 0 002.625.372 9.337 9.337 0 004.121-.952 4.125 4.125 0 00-7.533-2.493M15 19.128v-.003c0-1.113-.285-2.16-.786-3.07M15 19.128v.106A12.318 12.318 0 018.624 21c-2.331 0-4.512-.645-6.374-1.766l-.001-.109a6.375 6.375 0 0111.964-3.07M12 6.375a3.375 3.375 0 11-6.75 0 3.375 3.375 0 016.75 0zm8.25 2.25a2.625 2.625 0 11-5.25 0 2.625 2.625 0 015.25 0z"
              />
            </svg>
            <div class="pt-2 pb-2 pl-1 text-left">도전인원</div>
          </div>
          <hr class="m-2" />

          <div class="flex items-center mb-4">
            <div class="text-sm ml-4">
              <p class="text-gray-900 leading-none">6명</p>
            </div>
          </div>
        </div>

        <div>
          <div class="p-2 text-left">
            예약일시
            <hr class="m-2" />
          </div>

          <div class="flex items-center mb-4">
            <div class="text-sm ml-4">
              <p class="text-gray-900 leading-none">2022.09.20 16시 50분</p>
            </div>
          </div>
        </div>

        <div>
          <div class="p-2 text-left">
            입금확인
            <hr class="m-2" />
          </div>

          <div class="flex items-center mb-4">
            <div class="text-sm ml-4">
              <div v-if="money == false" class="flex">
                <p class="text-gray-900 leading-none mt-2">
                  입금확인을해주세요💸
                </p>
                <button
                  class="bg-purple-600 text-white active:bg-indigo-600 text-xs font-bold uppercase px-3 py-2 ml-4 rounded outline-none focus:outline-none ease-linear transition-all duration-150"
                  type="button"
                >
                  입금확인
                </button>
              </div>
              <div v-else>
                <p class="text-gray-900 leading-none mt-2">
                  입금이완료되었습니다💸
                </p>
                <button
                  class="bg-purple-600 text-white active:bg-indigo-600 text-xs font-bold uppercase px-3 py-1 ml-4 rounded outline-none focus:outline-none ease-linear transition-all duration-150"
                  type="button"
                >
                  입금취소
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="w-1/3 p-2">
        <div>
          <div class="p-2 text-left">
            도전테마
            <hr class="m-2" />
          </div>

          <div class="items-center mb-4">
            <img
              class="mr-4"
              src="../assets/escapemain.jpg"
              alt="Avatar of Jonathan Reinink"
            />
            <div class="text-sm m-4">
              <p class="text-gray-900 leading-none">모모게임</p>
            </div>
            <div class="flex justify-center">
              <div class="px-2" v-for="index in level" :key="index">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  fill="gold"
                  viewBox="0 0 24 24"
                  stroke-width="1.5"
                  stroke="currentColor"
                  class="w-8 h-8"
                  color="#2f4f4f"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    d="M11.48 3.499a.562.562 0 011.04 0l2.125 5.111a.563.563 0 00.475.345l5.518.442c.499.04.701.663.321.988l-4.204 3.602a.563.563 0 00-.182.557l1.285 5.385a.562.562 0 01-.84.61l-4.725-2.885a.563.563 0 00-.586 0L6.982 20.54a.562.562 0 01-.84-.61l1.285-5.386a.562.562 0 00-.182-.557l-4.204-3.602a.563.563 0 01.321-.988l5.518-.442a.563.563 0 00.475-.345L11.48 3.5z"
                  />
                </svg>
              </div>
              <div class="px-2" v-for="index in 5 - level" :key="index">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke-width="1.5"
                  stroke="currentColor"
                  class="w-8 h-8"
                  color="gray"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    d="M11.48 3.499a.562.562 0 011.04 0l2.125 5.111a.563.563 0 00.475.345l5.518.442c.499.04.701.663.321.988l-4.204 3.602a.563.563 0 00-.182.557l1.285 5.385a.562.562 0 01-.84.61l-4.725-2.885a.563.563 0 00-.586 0L6.982 20.54a.562.562 0 01-.84-.61l1.285-5.386a.562.562 0 00-.182-.557l-4.204-3.602a.563.563 0 01.321-.988l5.518-.442a.563.563 0 00.475-.345L11.48 3.5z"
                  />
                </svg>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      money: false,
      level: 3,
    };
  },
};
</script>

<style></style>
