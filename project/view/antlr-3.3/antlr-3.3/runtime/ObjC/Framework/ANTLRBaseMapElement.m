//
//  ANTLRBaseMapElement.h
//  ANTLR
//
//  Created by Alan Condit on 6/16/10.
// [The "BSD licence"]
// Copyright (c) 2010 Alan Condit
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
// 3. The name of the author may not be used to endorse or promote products
//    derived from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
// IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
// OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
// IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
// NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
// THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

#import "ANTLRBaseMapElement.h"


@implementation ANTLRBaseMapElement

@synthesize index;

+ (ANTLRBaseMapElement *)newANTLRBaseMapElement
{
    return [[ANTLRBaseMapElement alloc] init];
}

+ (ANTLRBaseMapElement *)newANTLRBaseMapElementWithIndex:(NSNumber *)aNumber
{
    return [[ANTLRBaseMapElement alloc] initWithAnIndex:(NSNumber *)aNumber];
}

- (id) init
{
    if ((self = [super init]) != nil ) {
        index = nil;
    }
    return (self);
}

- (id) initWithAnIndex:(NSNumber *)aNumber
{
    if ((self = [super init]) != nil ) {
        [aNumber retain];
        index = aNumber;
    }
    return (self);
}

- (id) copyWithZone:(NSZone *)aZone
{
    ANTLRBaseMapElement *copy;
    
    copy = [super copyWithZone:aZone];
    copy.index = index;
    return( copy );
}

- (id)getIndex
{
    return index;
}

- (void)setIndex:(id)anIdx
{
    [anIdx retain];
    index = anIdx;
}

- (NSInteger)count
{
    return 1;
}
                          
                          
- (NSInteger)size
{
    return(  sizeof(index) );
}

@end
