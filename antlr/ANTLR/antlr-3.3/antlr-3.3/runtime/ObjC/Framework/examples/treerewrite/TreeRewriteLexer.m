/** \file
 *  This OBJC source file was generated by $ANTLR version 3.2 Aug 24, 2010 10:45:57
 *
 *     -  From the grammar source file : TreeRewrite.g
 *     -                            On : 2010-08-24 14:18:09
 *     -                 for the lexer : TreeRewriteLexerLexer *
 * Editing it, at least manually, is not wise. 
 *
 * ObjC language generator and runtime by Alan Condit, acondit|hereisanat|ipns|dotgoeshere|com.
 *
 *
*/
// [The "BSD licence"]
// Copyright (c) 2010 Alan Condit
//
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

// $ANTLR 3.2 Aug 24, 2010 10:45:57 TreeRewrite.g 2010-08-24 14:18:09

/* -----------------------------------------
 * Include the ANTLR3 generated header file.
 */
#import "TreeRewriteLexer.h"
/* ----------------------------------------- */


/* ============================================================================= */

/* =============================================================================
 * Start of recognizer
 */


/** As per Terence: No returns for lexer rules! */
@implementation TreeRewriteLexer // line 330

+ (void) initialize
{
    [ANTLRBaseRecognizer setGrammarFileName:@"TreeRewrite.g"];
}

+ (NSString *) tokenNameForType:(NSInteger)aTokenType
{
    return [[self getTokenNames] objectAtIndex:aTokenType];
}

+ (TreeRewriteLexer *)newTreeRewriteLexerWithCharStream:(id<ANTLRCharStream>)anInput
{
    return [[TreeRewriteLexer alloc] initWithCharStream:anInput];
}

- (id) initWithCharStream:(id<ANTLRCharStream>)anInput
{
    if ((self = [super initWithCharStream:anInput State:[ANTLRRecognizerSharedState newANTLRRecognizerSharedStateWithRuleLen:3+1]]) != nil) {

    }
    return self;
}

- (void) dealloc
{
    [super dealloc];
}

/* Start of actions.lexer.methods */
/* start methods() */

/* Start of Rules */
// $ANTLR start "INT"
- (void) mINT
{
    //
    /* ruleScopeSetUp */

    @try {
        NSInteger _type = INT;
        NSInteger _channel = ANTLRTokenChannelDefault;
        // TreeRewrite.g:15:5: ( ( '0' .. '9' )+ ) // ruleBlockSingleAlt
        // TreeRewrite.g:15:7: ( '0' .. '9' )+ // alt
        {
        // TreeRewrite.g:15:7: ( '0' .. '9' )+ // positiveClosureBlock
        NSInteger cnt1=0;
        do {
            NSInteger alt1=2;
            NSInteger LA1_0 = [input LA:1];
            if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=1;
            }


            switch (alt1) {
                case 1 : ;
                    // TreeRewrite.g:15:8: '0' .. '9' // alt
                    {
                    [self matchRangeFromChar:'0' to:'9'];   /* element() */
                     /* elements */
                    }
                    break;

                default :
                    if ( cnt1 >= 1 )
                        goto loop1;
                    ANTLREarlyExitException *eee = [ANTLREarlyExitException exceptionWithStream:input decisionNumber:1];
                    @throw eee;
            }
            cnt1++;
        } while (YES);
        loop1: ;
          /* element() */
         /* elements */
        }

        // token+rule list labels

        [state setType:_type];

        state.channel = _channel;
    }
    @finally {
        //
    }
    return;
}
// $ANTLR end "INT"

// $ANTLR start "WS"
- (void) mWS
{
    //
    /* ruleScopeSetUp */

    @try {
        NSInteger _type = WS;
        NSInteger _channel = ANTLRTokenChannelDefault;
        // TreeRewrite.g:18:5: ( ' ' ) // ruleBlockSingleAlt
        // TreeRewrite.g:18:9: ' ' // alt
        {
        [self matchChar:' ']; 
          /* element() */
        _channel=99;  /* element() */
         /* elements */
        }

        // token+rule list labels

        [state setType:_type];

        state.channel = _channel;
    }
    @finally {
        //
    }
    return;
}
// $ANTLR end "WS"

- (void) mTokens
{
    // TreeRewrite.g:1:8: ( INT | WS ) //ruleblock
    NSInteger alt2=2;
    NSInteger LA2_0 = [input LA:1];

    if ( ((LA2_0>='0' && LA2_0<='9')) ) {
        alt2=1;
    }
    else if ( (LA2_0==' ') ) {
        alt2=2;
    }
    else {
        ANTLRNoViableAltException *nvae = [ANTLRNoViableAltException newANTLRNoViableAltException:2 state:0 stream:input];
        @throw nvae;
    }
    switch (alt2) {
        case 1 : ;
            // TreeRewrite.g:1:10: INT // alt
            {
                [self mINT]; 
              /* element() */
             /* elements */
            }
            break;
        case 2 : ;
            // TreeRewrite.g:1:14: WS // alt
            {
                [self mWS]; 
              /* element() */
             /* elements */
            }
            break;

    }

}

@end /* end of TreeRewriteLexer implementation line 397 */

/* End of code
 * =============================================================================
 */
