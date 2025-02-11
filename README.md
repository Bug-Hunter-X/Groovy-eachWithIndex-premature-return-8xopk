# Groovy eachWithIndex Premature Return Bug

This repository demonstrates a common pitfall in Groovy when using the `eachWithIndex` method.  A `return` statement within the closure does *not* break out of the loop as one might expect in other languages.

The `bug.groovy` file shows the erroneous code.  The `bugSolution.groovy` file provides the corrected version.

## Problem

The `return` statement inside the `eachWithIndex` closure prematurely ends the iteration.  If you want to stop the loop entirely, you should use `break`.