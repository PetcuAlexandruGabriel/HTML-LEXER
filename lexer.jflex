    
import java_cup.runtime.Symbol;
    
%%

%class Lexer
%implements symbols 
%unicode
%cup
%line
%column


Comment = "<!--" [^*] ~"-->" 
   
%%

    <YYINITIAL> {

      /* Tags */
      ">"                         { return symbol(sym.endTag); }
      "<body"                     { return symbol(sym.bodyOpen); }
      "</body"			              { return symbol(sym.bodyClose); }
      "<frame"			              { return symbol(sym.frame); }
      "<frameset"		              { return symbol(sym.framesetOpen); }
      "</frameset"		            { return symbol(sym.framesetClose); }
      "<noframes"		              { return symbol(sym.noframesOpen); }
      "</noframes"		            { return symbol(sym.noframesClose); }
      "<form"			                { return symbol(sym.formOpen); }
      "</form"			              { return symbol(sym.formClose); }
      "<input"			              { return symbol(sym.input); }
      "<select"			              { return symbol(sym.selectOpen); }
      "</select"		              { return symbol(sym.selectClose); }
      "<option"			              { return symbol(sym.optionOpen); }
      "</option"		              { return symbol(sym.optionClose); }
      "<table"		  	            { return symbol(sym.tableOpen); }
      "</table"			              { return symbol(sym.tableClose); }
      "<tr"			                  { return symbol(sym.trOpen); }
      "</tr"			                { return symbol(sym.trClose); }
      "<td"			                  { return symbol(sym.tdOpen); }
      "</td"			                { return symbol(sym.tdClose); }
      "<th"			                  { return symbol(sym.thOpen); }
      "</th"			                { return symbol(sym.thClose); }
      "<thead"			              { return symbol(sym.thread); }
      "<tbody"			              { return symbol(sym.tbody); }
      "<img"			                { return symbol(sym.img); }
      "<a"			                  { return symbol(sym.aOpen); }
      "</a"			                  { return symbol(sym.aClose); }
      "<ul"			                  { return symbol(sym.ulOpen); }
      "</ul"			                { return symbol(sym.ulClose); }
      "<li"			                  { return symbol(sym.liOpen); }
      "</li"			                { return symbol(sym.liClose); }
      "<ol"			                  { return symbol(sym.olOpen); }
      "</ol"			                { return symbol(sym.olClose); }
      "<p"			                  { return symbol(sym.pOpen); }
      "</p>"			                { return symbol(sym.pClose); }
      "<i"			                  { return symbol(sym.iOpen); }
      "</i"			                  { return symbol(sym.iClose); }
      "<u"			                  { return symbol(sym.uOpen); }
      "</u"			                  { return symbol(sym.uClose); }
      "<small"			              { return symbol(sym.smallOpen); }
      "</small"			              { return symbol(sym.smallClose); }
      "<sup"			                { return symbol(sym.supOpen); }
      "</sup"			                { return symbol(sym.supClose); }
      "<sub"			                { return symbol(sym.subOpen); }
      "</sub"			                { return symbol(sym.subClose); }
      "center"			              { return symbol(sym.center); }
      "<font"			                { return symbol(sym.fontOpen); }
      "</font"			              { return symbol(sym.fontClose); }
      "<h1"			                  { return symbol(sym.h1Open); }
      "</h1"			                { return symbol(sym.h1Close); }
      "<h2"			                  { return symbol(sym.h2Open); }
      "</h2"			                { return symbol(sym.h2Close); }
      "<h3"			                  { return symbol(sym.h3Open); }
      "</h3"			                { return symbol(sym.h3Close); }
      "<h4"			                  { return symbol(sym.h4Open); }
      "</h4"			                { return symbol(sym.h4Close); }
      "<h5"			                  { return symbol(sym.h5Open); }
      "</h5"			                { return symbol(sym.h5Close); }
      "<h6"			                  { return symbol(sym.h6Open); }
      "</h6"			                { return symbol(sym.h6Close); }
      "<hr"			                  { return symbol(sym.hr); }
      "<br"			                  { return symbol(sym.br); }

      /* Global Attributes */
      
      "class"			                { return symbol(sym.accesskey); }
      "dir"			                  { return symbol(sym.accesskey); }
      "id"			                  { return symbol(sym.accesskey); }
      "lang"			                { return symbol(sym.accesskey); }
      "onclick"			              { return symbol(sym.accesskey); }
      "ondblclick"                { return symbol(sym.accesskey); }
      "onkeydown"                 { return symbol(sym.accesskey); }
      "onkeypress"                { return symbol(sym.accesskey); }
      "onkeyup"                   { return symbol(sym.accesskey); }
      "onmousedown"               { return symbol(sym.accesskey); }
      "onmousemove"               { return symbol(sym.accesskey); }
      "onmouseout"                { return symbol(sym.accesskey); }
      "onmouseover"               { return symbol(sym.accesskey); }
      "onmouseup"                 { return symbol(sym.accesskey); }
      "contenteditable"			      { return symbol(sym.accesskey); }
      "contextmenu"			          { return symbol(sym.accesskey); }
      "data"			                { return symbol(sym.accesskey); }
      "draggable"			            { return symbol(sym.accesskey); }
      "dropzone"	                { return symbol(sym.accesskey); }
      "hidden"	                  { return symbol(sym.accesskey); }
      "spellcheck"			          { return symbol(sym.accesskey); }
      "style"			                { return symbol(sym.accesskey); }
      "tabindex"			            { return symbol(sym.accesskey); }
      "title"			                { return symbol(sym.accesskey); }

      /* Attributes */

      "accesskey"                 { return symbol(sym.accesskey); }
      "charset"                   { return symbol(sym.accesskey); }
      "charset"                   { return symbol(sym.accesskey); }
      "href"                      { return symbol(sym.accesskey); }
      "hreflang"                  { return symbol(sym.accesskey); }
      "name"                      { return symbol(sym.accesskey); }
      "rel"                       { return symbol(sym.accesskey); }
      "rev"                       { return symbol(sym.accesskey); }
      "shape"                     { return symbol(sym.accesskey); }
      "tabindex"                  { return symbol(sym.accesskey); }
      "target"                    { return symbol(sym.accesskey); }
      "type"                      { return symbol(sym.accesskey); }
      "align"                     { return symbol(sym.accesskey); }
      "alt"                       { return symbol(sym.accesskey); }
      "archive"                   { return symbol(sym.accesskey); }
      "code"                      { return symbol(sym.accesskey); }
      "codebase"                  { return symbol(sym.accesskey); }
      "height"                    { return symbol(sym.accesskey); }
      "hspace"                    { return symbol(sym.accesskey); }
      "mayscript"                 { return symbol(sym.accesskey); }
      "name"                      { return symbol(sym.accesskey); }
      "vspace"                    { return symbol(sym.accesskey); }
      "width"                     { return symbol(sym.accesskey); }
      "loop"                      { return symbol(sym.accesskey); }
      "background"                { return symbol(sym.accesskey); }
      "bgcolor"                   { return symbol(sym.accesskey); }
      "bgproperties"              { return symbol(sym.accesskey); }
      "leftmargin"                { return symbol(sym.accesskey); }
      "clear"                     { return symbol(sym.accesskey); }
    }
    
    
