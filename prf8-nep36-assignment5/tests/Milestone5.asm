.text
main:
L0:
addi $sp, $sp, -100
sw $ra, 96($sp)
sw $s0, 92($sp)
sw $s1, 88($sp)
sw $s2, 84($sp)
sw $s3, 80($sp)
sw $s4, 76($sp)
sw $s5, 72($sp)
sw $s6, 68($sp)
sw $s7, 64($sp)
sw $a0, 60($sp)
sw $a1, 56($sp)
sw $a2, 52($sp)
sw $a3, 48($sp)
sw $t0, 44($sp)
sw $t1, 40($sp)
sw $t2, 36($sp)
sw $t3, 32($sp)
sw $t4, 28($sp)
sw $t5, 24($sp)
sw $t6, 20($sp)
sw $t7, 16($sp)
sw $t8, 12($sp)
sw $t9, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $a0, 9
jal _system_out_println
lw $t9, 8($sp)
lw $t8, 12($sp)
lw $t7, 16($sp)
lw $t6, 20($sp)
lw $t5, 24($sp)
lw $t4, 28($sp)
lw $t3, 32($sp)
lw $t2, 36($sp)
lw $t1, 40($sp)
lw $t0, 44($sp)
lw $a3, 48($sp)
lw $a2, 52($sp)
lw $a1, 56($sp)
lw $a0, 60($sp)
lw $s7, 64($sp)
lw $s6, 68($sp)
lw $s5, 72($sp)
lw $s4, 76($sp)
lw $s3, 80($sp)
lw $s2, 84($sp)
lw $s1, 88($sp)
lw $s0, 92($sp)
lw $v1, 0($sp)
lw $v0, 4($sp)
lw $ra, 96($sp)
addi $sp, $sp, 100
jal _system_exit
li $t2, 9
move $t1, $t2
move $t2, $t0
blt $t2, 9, L6
add $t2, $zero, $zero
j L7
L6:
addi $t2, $zero, 1
L7:
beq $t2, $zero, L1
addi $sp, $sp, -100
sw $ra, 96($sp)
sw $s0, 92($sp)
sw $s1, 88($sp)
sw $s2, 84($sp)
sw $s3, 80($sp)
sw $s4, 76($sp)
sw $s5, 72($sp)
sw $s6, 68($sp)
sw $s7, 64($sp)
sw $a0, 60($sp)
sw $a1, 56($sp)
sw $a2, 52($sp)
sw $a3, 48($sp)
sw $t0, 44($sp)
sw $t1, 40($sp)
sw $t2, 36($sp)
sw $t3, 32($sp)
sw $t4, 28($sp)
sw $t5, 24($sp)
sw $t6, 20($sp)
sw $t7, 16($sp)
sw $t8, 12($sp)
sw $t9, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $a0, 9
jal _system_out_println
lw $t9, 8($sp)
lw $t8, 12($sp)
lw $t7, 16($sp)
lw $t6, 20($sp)
lw $t5, 24($sp)
lw $t4, 28($sp)
lw $t3, 32($sp)
lw $t2, 36($sp)
lw $t1, 40($sp)
lw $t0, 44($sp)
lw $a3, 48($sp)
lw $a2, 52($sp)
lw $a1, 56($sp)
lw $a0, 60($sp)
lw $s7, 64($sp)
lw $s6, 68($sp)
lw $s5, 72($sp)
lw $s4, 76($sp)
lw $s3, 80($sp)
lw $s2, 84($sp)
lw $s1, 88($sp)
lw $s0, 92($sp)
lw $v1, 0($sp)
lw $v0, 4($sp)
lw $ra, 96($sp)
addi $sp, $sp, 100
j L2
L1:
addi $sp, $sp, -100
sw $ra, 96($sp)
sw $s0, 92($sp)
sw $s1, 88($sp)
sw $s2, 84($sp)
sw $s3, 80($sp)
sw $s4, 76($sp)
sw $s5, 72($sp)
sw $s6, 68($sp)
sw $s7, 64($sp)
sw $a0, 60($sp)
sw $a1, 56($sp)
sw $a2, 52($sp)
sw $a3, 48($sp)
sw $t0, 44($sp)
sw $t1, 40($sp)
sw $t2, 36($sp)
sw $t3, 32($sp)
sw $t4, 28($sp)
sw $t5, 24($sp)
sw $t6, 20($sp)
sw $t7, 16($sp)
sw $t8, 12($sp)
sw $t9, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $a0, 0
jal _system_out_println
lw $t9, 8($sp)
lw $t8, 12($sp)
lw $t7, 16($sp)
lw $t6, 20($sp)
lw $t5, 24($sp)
lw $t4, 28($sp)
lw $t3, 32($sp)
lw $t2, 36($sp)
lw $t1, 40($sp)
lw $t0, 44($sp)
lw $a3, 48($sp)
lw $a2, 52($sp)
lw $a1, 56($sp)
lw $a0, 60($sp)
lw $s7, 64($sp)
lw $s6, 68($sp)
lw $s5, 72($sp)
lw $s4, 76($sp)
lw $s3, 80($sp)
lw $s2, 84($sp)
lw $s1, 88($sp)
lw $s0, 92($sp)
lw $v1, 0($sp)
lw $v0, 4($sp)
lw $ra, 96($sp)
addi $sp, $sp, 100
L2:
li $t3, 0
move $t0, $t3
L3:
move $t3, $t0
blt $t3, $t0, L8
add $t3, $zero, $zero
j L9
L8:
addi $t3, $zero, 1
L9:
beq $t3, $zero, L4
move $t4, $t0
addi $t4, $t4, 1
move $t5, $t4
move $t0, $t5
addi $sp, $sp, -100
sw $ra, 96($sp)
sw $s0, 92($sp)
sw $s1, 88($sp)
sw $s2, 84($sp)
sw $s3, 80($sp)
sw $s4, 76($sp)
sw $s5, 72($sp)
sw $s6, 68($sp)
sw $s7, 64($sp)
sw $a0, 60($sp)
sw $a1, 56($sp)
sw $a2, 52($sp)
sw $a3, 48($sp)
sw $t0, 44($sp)
sw $t1, 40($sp)
sw $t2, 36($sp)
sw $t3, 32($sp)
sw $t4, 28($sp)
sw $t5, 24($sp)
sw $t6, 20($sp)
sw $t7, 16($sp)
sw $t8, 12($sp)
sw $t9, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $a0, 1
jal _system_out_println
lw $t9, 8($sp)
lw $t8, 12($sp)
lw $t7, 16($sp)
lw $t6, 20($sp)
lw $t5, 24($sp)
lw $t4, 28($sp)
lw $t3, 32($sp)
lw $t2, 36($sp)
lw $t1, 40($sp)
lw $t0, 44($sp)
lw $a3, 48($sp)
lw $a2, 52($sp)
lw $a1, 56($sp)
lw $a0, 60($sp)
lw $s7, 64($sp)
lw $s6, 68($sp)
lw $s5, 72($sp)
lw $s4, 76($sp)
lw $s3, 80($sp)
lw $s2, 84($sp)
lw $s1, 88($sp)
lw $s0, 92($sp)
lw $v1, 0($sp)
lw $v0, 4($sp)
lw $ra, 96($sp)
addi $sp, $sp, 100
j L3
L4:
L5:
li $v0, 0
jr $ra
# main is testing the functions I've provided. You will include this code at the end
# of your output file so that you may call these system services.

#main:
#    li $a0, 100
#    jal _new_array
#    move $s0, $v0
#    move $a0, $v0
#    jal _system_out_println
#    lw $a0, 0($s0)
#    jal _system_out_println
#    jal _system_exit

_system_exit:
li $v0, 10 #exit
syscall

# Integer to print is in $a0.
# Kills $v0 and $a0
_system_out_println:
# print integer
li  $v0, 1
syscall
# print a newline
li $a0, 10
li $v0, 11
syscall
jr $ra

# $a0 = number of bytes to allocate
# $v0 contains address of allocated memory
_new_object:
# sbrk
li $v0, 9
syscall

#initialize with zeros
move $t0, $a0
move $t1, $v0
_new_object_loop:
beq $t0, $zero, _new_object_exit
sb $zero, 0($t1)
addi $t1, $t1, 1
addi $t0, $t0, -1
j _new_object_loop
_new_object_exit:
jr $ra

# $a0 = number of bytes to allocate
# $v0 contains address of allocated memory (with offset 0 being the size)
_new_array:
# add space for the size (1 integer)
addi $a0, $a0, 4
# sbrk
li $v0, 9
syscall
#initialize to zeros
move $t0, $a0
move $t1, $v0
_new_array_loop:
beq $t0, $zero, _new_array_exit
sb $zero, 0($t1)
addi $t1, $t1, 1
addi $t0, $t0, -1
j _new_array_loop
_new_array_exit:
#store the size (number of ints) in offset 0
addi $t0, $a0, -4
sra $t0, $t0, 2
sw $t0, 0($v0)
jr $ra

