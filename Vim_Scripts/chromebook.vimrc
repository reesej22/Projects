"!/bin/vim*

let skip_defaults_vim = 1
set number
set nocompatible

" Enable filetype plugins
filetype plugin on
filetype indent on

" Set to auto read when a file is changed
set autoread

" Set 7 lines to the cursor - when moving
set so=7

" Language
let $LANG='en'
set langmenu=en

source $VIMRUNTIME/delmenu.vim
source $VIMRUNTIME/menu.vim

" turn on the wild menu
set wildmenu

" Always show the current positon
set ruler

" configure backspace so it acts as it should
set backspace=eol,start,indent
set whichwrap+=<,>,h,l

" Ignore case when searching
set ignorecase
set smartcase

" Highlight search results
set hlsearch

" Makes search act like search in modern browser
set incsearch

" Don't redraw while executing macros
set lazyredraw

" For regular expressions turn magic on
set magic

" Show matching brackets when text indicator is over them
set showmatch

" How many tenths of a second to blink when matching brackets
set mat=2

" No annoying sounds on errors
set noerrorbells
set visualbell
set tm=500

" add extra margin to the left
set foldcolumn=1

" add mouse functionality
if has('mouse')
	set mouse=a
endif

" add syntax highlighting
syntax enable
set background=dark

" enabe 256 colors palatte in terminal
if $COLORTERM == 'vim.gtk3'
	set t_Co=256
endif
try
	colorscheme desert
catch
endtry

" extra options when running in GUI mode
if has("gui_running")
	set guioptions-=T
	set guioptions-=e
	set t_Co=256
	set guitablabel=%M\ %t
endif

" set utf8 as standard encoding
set encoding=utf8

" text, tabs, and indents
set smarttab
set shiftwidth=4
set tabstop=4

set lbr
set tw=500
set autoindent
set smartindent
set wrap

" Delete trailing white space on save, useful for some filetypes ;)
fun! CleanExtraSpaces()
    let save_cursor = getpos(".")
    let old_query = getreg('/')
    silent! %s/\s\+$//e
    call setpos('.', save_cursor)
    call setreg('/', old_query)
endfun

if has("autocmd")
    autocmd BufWritePre *.txt,*.js,*.py,*.wiki,*.sh,*.coffee :call CleanExtraSpaces()
endif

" Emmet Short Cut
let g:user_emmet_leader_key=','

" Vim Airline Settings
let g:airline#extensions#tabline#enabled = 1
let g:airline_powerline_fonts = 1
