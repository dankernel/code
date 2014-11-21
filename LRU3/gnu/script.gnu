
set terminal postscript enhanced mono
set term post font ",20"
set output "gnuplot.eps"

#Style
set style data linespoints

#Title
set title "LRU cache hit ratio"

#Key
set key bottom

#Lable
set ylabel "Hit rato(%)"
set xlabel "Cache size(2^n)"

#yrange
set yrange [0:100]

set xtic rotate by 0 scale 1

#1 plot 'result.dat' using 2:xtic(1) pt 3 title columnheader 10
#2 plot 'result.dat' using 3:xtic(1) title columnheader 10

plot 'result.dat' using 2:xtic(1) title columnheader(10) , \
       for [i=3:3] '' using i:xtic(1) title columnheader(i)
set output
