#!/bin/bash

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd)"
cd "$DIR"/.. || exit

for (( i = 0; i < 2; i++ )); do
    arguments="$i "
    arguments=$arguments"comp5111.assignment.cut.Regression_10_Test "
    arguments=$arguments'comp5111.assignment.cut.Subject '
    arguments=$arguments'comp5111.assignment.cut.Subject$WebUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$TextUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$DateTimeUtils '

    mvn clean compile exec:java -Dexec.mainClass="comp5111.assignment.Assignment1" \
    -Dexec.args="$arguments"
done
