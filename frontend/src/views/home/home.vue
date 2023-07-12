<template>
  <el-container class="">
    <el-header class="DaTableup">
      <el-row :gutter="20" class="Tableup" style="margin-right: 0">
        <el-col :lg="10">
          <div class="grid-content ep-bg-purple yangshizuo">
            <span>健身</span>
            <span>培训</span>
          </div>
        </el-col>
        <el-col :lg="10">
          <div class="grid-content ep-bg-purple yangshiyou">
            <!-- 导航按钮循环 -->
            <div v-for="(button, index) in buttons" :key="index">
              <el-button link @click="goPage(index)">
                {{ button }}
              </el-button>
            </div>
          </div>
        </el-col>
      </el-row>
    </el-header>
    <!-- <div class="fom">
      <el-form :model="form" label-width="120px">
        <el-form-item label="姓名">
          <el-input v-model="form.name" />
        </el-form-item>
        <el-form-item label="手机号码">
          <el-input v-model="form.shouji" />
        </el-form-item>
        <el-form-item label="入班时间">
          <el-col :span="11">
            <el-date-picker v-model="form.date1" type="date" placeholder="Pick a date" style="width: 100%" />
          </el-col>
          <el-col :span="2" class="text-center">
            <span class="text-gray-500">-</span>
          </el-col>
          <el-col :span="11">
            <el-time-picker v-model="form.date2" placeholder="Pick a time" style="width: 100%" />
          </el-col>
        </el-form-item>
        <el-form-item label="留言">
          <el-input v-model="form.desc" type="textarea" />
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">Create</el-button>
          <el-button>Cancel</el-button> -->
    <!-- </el-form-item>
      </el-form>
    </div> -->
    <el-main style="padding: 0" class="emain">
      <swiper
        :space-between="30"
        :centered-slides="true"
        :autoplay="{ delay: 2500 }"
        :navigation="true"
        :modules="modules"
        class="bg-auto bg-dx"
        style="height: 90vh"
      >
        <swiper-slide>
          <img src="@/assets/img/fitness.webp" alt="aa" />
        </swiper-slide>
        <swiper-slide>
          <img src="@/assets/img/fitness2.jpg" alt="aa" />
        </swiper-slide>
      </swiper>
    </el-main>
  </el-container>
  <div>
    <div>
      <p class="text-center text-3xl">课程介绍</p>
      <p class="text-center text-base">如果你体型均称有可塑性，又热爱运动，我们让你成为优秀教练同时拥有体型不是梦。</p>
      <img src="@/assets/img/xian.png" alt="aa" />
      <div class="flex !justify-between">
        <swiper
          v-for="delay in [2000, 1000, 1500]"
          :key="delay"
          class="card !flex !inline-flex"
          :loop="true"
          :space-between="30"
          :centered-slides="true"
          :autoplay="{ delay: delay, disableOnInteraction: false }"
          :pagination="{ clickable: true }"
          :navigation="false"
          :grab-cursor="true"
          :effect="'creative'"
          :creative-effect="{
            prev: {
              shadow: true,
              translate: [0, 0, -400],
            },
            next: {
              translate: ['100%', 0, 0],
            },
          }"
          :modules="modules"
        >
          <swiper-slide><img src="@/assets/img/a1.jpg" alt="" /></swiper-slide>
          <swiper-slide><img src="@/assets/img/a2.jpg" alt="" /></swiper-slide>
          <swiper-slide><img src="@/assets/img/a3.jpg" alt="" /></swiper-slide>
        </swiper>
      </div>
    </div>
    <div class="pt-4">
      <el-row :gutter="20" class="flex mx-6">
        <el-col :span="8">
          <div class="card m-auto flex flex-col items-center">
            <span class="text-2xl text-center font-semibold py-3">私教初级</span>
            <span class="font-semibold">
              适合健身健美爱好者 课程包含：心肺复苏、基础私教理论 基础私教实践、私教销售。 共计140课时，30天的学习时间
            </span>
            <el-button color="#171717" type="primary" class="w-[40%] mt-5">Primary</el-button>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="card m-auto flex flex-col items-center">
            <span class="text-2xl text-center font-semibold py-3">私教中级课程</span>
            <span class="font-semibold">
              适合健身健美爱好者 课程包含：心肺复苏、基础私教理论 基础私教实践、私教销售。 共计140课时，30天的学习时间
            </span>
            <el-button color="#171717" type="primary" class="w-[40%] mt-5">Primary</el-button>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="card m-auto flex flex-col items-center">
            <span class="text-2xl text-center font-semibold py-3">私教课程</span>
            <span class="font-semibold">
              适合健身健美爱好者 课程包含：心肺复苏、基础私教理论 基础私教实践、私教销售。 共计140课时，30天的学习时间
            </span>
            <br />
            <el-button color="#171717" type="primary" class="w-[40%] mt-5">Primary</el-button>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script setup lang="ts">
import { Swiper, SwiperSlide } from 'swiper/vue';
import { useRouter } from 'vue-router';
import 'swiper/css';
import 'swiper/css/navigation';
import 'swiper/swiper-bundle.css';
// import { Navigation } from 'swiper';
// import { EffectCreative } from 'swiper';
import { Autoplay, Pagination, Navigation, EffectCreative } from 'swiper';
import Color from 'element-plus/es/components/color-picker/src/color';
// 表单引入
import { reactive } from 'vue';

const ascii = `

││││││╞╞┌└└││┌│││└┌││┌┌└│┌│└││││││┌╞││└└│┌│││││┌││││││┌│││└│┌┌╞└│││││││││││││││││││││││││││││││││││
││││││││││││┌┌││└││┌┌││││┌│││└││┌┌└│└││││││││││┌││┌│││┌┌││┌││╞│││└││││││││││││││││││││││││││││││││││

│││││││││││░││░││└││││┌│││└││┌└││└││││╞││└│││││└│││││││││╞│┌└┌│││└││││││││││││││││││││││││││││││││││

││││││││▄▒░░▒▒│││││││░▒█████████▄│││░▄▒▄▄▄░▄█▄▄▄╔░▒███████████▒░└│││││││││││││││││││││││││││││││││││

││└│░││▄▓▒░▓███████▒│║▓████████▓▒│╔▄▒▀▓▓▒▀▓▀▀▓▒▀╚││▄▓▒│▒▓███▒▀▀│░│└│││││││││││││││││││││││││││││││││

││└││╔▄▓█▒▀▀│░▒▒░╣▀░│║▀▓█▀▀▀▀▀█▓░│╚░▄▄▄▒▄▄▒▄▄▄▄▄│║▒▓▀▀▀███▀▀▀▀▀╣│└││││││││││││││││││││││││││││││││││

│││││╣▀▓█░░▒▒╣▓▒╣█▒░╣▀▀▀▀▀███▀▀▀▀▀╝│╚║░▓▓▓▓▓▒│╜╚││║▓█▀▀███▀▀█▒░│││││││││││││││││││││││││││││││││││││

││└└╞││▓█▓▀▀└║▓▒│╚▀▀│░▄█┤│░▓█▀▀▀▀╝┌╔▄▒▓▀║▒▒░▀▓▄▄││║▓█▄▄▓▓▄▄▄▓█░╞┌└││││││││││││││││││││││││││││││││││

└└└│└││▓▓░│╖▄█▓▒│││║▄▓▀▀▀▓█▓█▄▄▄▄▄▒▀▀╝▀▀▀▓▓▀▀▀░▀▀┌│▀╝░╞░▓▓▄▓▓█▄┌┌│││││││││││││││││││││││││││││││││││

││││╞│╞└││┌││││└│┌││└││┌│└└│└││└│└│┌└││└╚▀▀│┌│││░╚▀▀▀▀▀▀░│└└│╚▀╝│└││││││││││││││││││││││││││││││││││

│┌┌│└└│││┌│││╞││└││││││││└│││└│┌│└│││││││││└│░││└│││┌└│┌││┌│░│││││││││││││││││││││││││││││││││││││││

│││┌││││┌││││││││││││┌│││││┌│┌│││││┌│││││││││││││││└┌│┌│┌││┌││││││││││││││││││││││││││││││││││││││││

││││││└└└│││││││││││││││││││││││││││││││││││││││



`;
console.log(`%c${ascii}`, 'color:#e59de3');

const form = reactive({
  name: '',
  shouji: '',
  region: '',
  date1: '',
  date2: '',
  delivery: false,
  type: [],
  resource: '',
  desc: '',
});

const onSubmit = () => {
  console.log('submit!');
};
const modules = ref([Autoplay, Pagination, Navigation, EffectCreative]);
const router = useRouter();

const buttons = ['首页', '关于我们', '私课教练', '在线报名', '行业'];

const goPage = (index: number) => {
  switch (index) {
    case 0:
      router.push({ name: 'home2' });
      break;
    default:
      break;
  }
};
</script>
<style lang="scss" scoped>
.bg-dx {
  img {
    width: 100%;
  }
}
// .d {
//   // width: 2117px;
// }

.Tableup {
  height: 100%;
  @apply flex bg-dark-900 text-6xl;
  .yangshizuo {
    span:nth-child(1) {
      @apply text-orange-400;
    }

    @apply text-light-100 ml-[25rem] mt-4;
  }

  .yangshiyou {
    @apply flex justify-between items-center mt-4;

    div {
      button {
        color: #eae880;
        @apply text-lg;
        :hover {
          color: #ffb113;
        }
      }
    }
  }
}

.DaTableup {
  padding: 0;
  height: 90px;
}
.card {
  width: 331px;
  height: 365px;
}

// .main2 {
//   height: 100%;
//   width: 100%;
//   div {
//     height: 5134px;
//     width: 1200px;
//     margin: 0 auto;
//     div {
//       width: 100%;
//       height: 935px;
//       h1 {
//         @apply text-center text-6xl;
//         margin-top: 60px;
//       }
//       h2 {
//         margin-top: 30px;
//         @apply text-center;
//       }
//       img {
//         margin-top: 20px;
//         margin-bottom: 60px;
//       }
//       // .a {
//       //   margin-left: 40px;
//       //   div {
//       //     margin-left: 0px;
//       //     img {
//       //       margin: 0 auto;
//       //     }
//       //   }
//       // }
//       // .b {
//       //   div {
//       //     margin-left: 0px;
//       //   }
//       //   img {
//       //     margin: 0 auto;
//       //   }
//       // }
//       // .c {
//       //   div {
//       //     margin-left: 0px;
//       //   }
//       //   img {
//       //     margin: 0 auto;
//       //   }
//       // }
//       .d {
//         display: block;
//         position: absolute;
//         // background-color: #ffb113;
//         height: 320px;
//         margin-bottom: 15px;
//         margin-left: 40px;
//         h1 {
//           @apply text-2xl font-medium mt-8 mb-4;
//         }
//         div {
//           @apply w-[244px] h-[100px];
//           margin: auto 43px;
//         }
//         //   .butn {
//         //     button {
//         //       @apply bg-dark-500
//         //        border-dark-400
//         //         w-[110px]
//         //          h-[35px]
//         //           mt-10
//         //            ml-16
//         //             text-xl;
//         //       border-radius: 0px;
//         //     }
//         //   }
//         // }
//         // .e {
//         //   display: block;
//         //   position: absolute;
//         //   // background-color: #ffb113;
//         //   height: 320px;
//         //   margin-bottom: 15px;
//         //   margin-left: 20.5%;
//         //   h1 {
//         //     @apply text-2xl font-medium mt-8 mb-4;
//         //   }
//         //   div {
//         //     @apply w-[244px] h-[100px];
//         //     margin: auto 43px;
//         //   }
//         //   .butn {
//         //     button {
//         //       @apply bg-dark-500
//         //        border-dark-400
//         //         w-[110px]
//         //          h-[35px]
//         //           mt-10 ml-16
//         //       text-xl;
//         //       border-radius: 0px;
//         //     }
//         //   }
//         // }
//         // .g {
//         //   display: block;
//         //   position: absolute;
//         //   // background-color: #ffb113;
//         //   height: 320px;
//         //   margin-bottom: 15px;
//         //   margin-left: 39%;
//         //   h1 {
//         //     @apply text-2xl font-medium mt-8 mb-4;
//         //   }
//         //   div {
//         //     @apply w-[244px] h-[100px];
//         //     margin: auto 43px;
//         //   }
//         //   .butn {
//         //     button {
//         //       @apply bg-dark-500
//         //        border-dark-400
//         //         w-[110px]
//         //        h-[35px]
//         //        mt-10
//         //         ml-16
//         //       text-xl;

//         //       border-radius: 0px;
//         //     }
//         //   }
//       }
//     }
//   }
// }
// .fom {
//   display: flex;
//   z-index: 2;
//   width: 560px;
//   height: 467px;
//   background-color: #ffb113;
//   margin: 0% 0 0 50%;
//   form {
//     margin: 0 auto;
//   }
// }
</style>
