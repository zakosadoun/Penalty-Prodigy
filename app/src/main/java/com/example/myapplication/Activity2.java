package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button btn = (Button) findViewById(R.id.bl);
        Button btn1 = (Button) findViewById(R.id.bm);
        Button btn2 = (Button) findViewById(R.id.br);
        Button btn3 = (Button) findViewById(R.id.tl);
        Button btn4 = (Button) findViewById(R.id.tm);
        Button btn5 = (Button) findViewById(R.id.tr);
        Button btn6 = (Button) findViewById(R.id.ml);
        Button btn7 = (Button) findViewById(R.id.mm);
        Button btn8 = (Button) findViewById(R.id.mr);




        final ImageView goal = (ImageView) findViewById(R.id.goal);
        final ImageView miss = (ImageView) findViewById(R.id.miss);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .66) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .33) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .66) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .75) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .50) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .75) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .50) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .25) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Math.random() < .50) {
                    goal.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    goal.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);
                } else {
                    miss.setVisibility(View.VISIBLE);
                    Timer t = new Timer(false);
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    miss.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    }, 2000);


                }

            }
        });
    }


}
