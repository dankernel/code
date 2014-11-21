

set terminal postscript enhanced mono
set term post font ",20"
set output "gnuplot.eps"

set title "Title"
set key outside bottom
set yrange [0:100]

set style fill pattern
set style data histogram
set style histogram clustered gap 1

set boxwidth 1
set xtic rotate by -90 scale 1
plot 'result.dat' using 2:xtic(1) title columnheader fs pattern 10
set output
