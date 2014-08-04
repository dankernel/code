#!/bin/sh

for loopdirectory in `ls -d ./*`; do
  echo $loopdirectory;
  for datadirectory in `ls $loopdirectory/*`; do
    echo $loopdirectory/$datadirectory;
    ./main $datadirectory
  done;
done;
