/*
 * =====================================================================================
 *
 *       Filename:  dk_kernel.h
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2014년 10월 08일 04시 27분 33초
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         author:   (), 
 *   organization:  
 *
 * =====================================================================================
 */
#define offsetof(s,m)   (size_t)&(((s *)0)->m)

#define container_of(ptr, type, member) ({                      \
            const typeof( ((type *)0)->member ) *__mptr = (ptr);    \
            (type *)( (char *)__mptr - offsetof(type,member) );})
