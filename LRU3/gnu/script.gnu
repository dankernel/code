

set terminal postscript enhanced mono
set term post font ",20"
set output "gnuplot.eps"

#Title
set title "LRU cache hit ratio"
set key outside bottom

#Lable
set ylabel "Hit rato(%)"
set xlabel "Cache size(2^n)"

#yrange
set yrange [0:100]

#set style fill pattern
set style data linespoints
set style histogram clustered gap 1

set boxwidth 1
set xtic rotate by 0 scale 1

plot 'result.dat' using 2:xtic(1) title columnheader 10
set output
