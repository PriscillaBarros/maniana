/*
 * Copyright (C) 2011 The original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.zapta.apps.maniana.settings;

import com.zapta.apps.maniana.R;
import com.zapta.apps.maniana.annotations.ApplicationScope;

/**
 * Today/Tomorrow pages predefined themes.
 * 
 * @author Tal Dayan
 */
@ApplicationScope
public class PageTheme extends Thumbnail {
	
	private static ColorThemes color;
	public static TitleThemes title;
	public static ItemThemes item;
	public static class ColorThemes {

		public static final ColorThemes[] COLOR_THEMES = {
    	// Default	
    	color = new ColorThemes(PreferenceConstants.DEFAULT_PAGE_BACKGROUND_PAPER,
    			PreferenceConstants.DEFAULT_PAGE_PAPER_COLOR,
    			PreferenceConstants.DEFAULT_PAGE_BACKGROUND_SOLID_COLOR,
    			PreferenceConstants.DEFAULT_PAGE_ICON_SET),
    			
    	new ColorThemes(false, 
    			0xffffffff,
    			0xfffcfcb8, 
    			PageIconSet.MODERN),
    			
    	new ColorThemes(false, 0xffffffff, 0xff000000,
				PageIconSet.WHITE),
    			
    	new ColorThemes(true, 0xfff0fff0, 0xffaaffff,
                PageIconSet.PARTY),   
    	};

    	public final boolean backgroundPaper;
    	public final int paperColor;
    	public final int backgroundSolidColor;
    	public final PageIconSet iconSet;
    	
    	public ColorThemes(boolean backgroundPaper, int paperColor,
    			int backgroundSolidColor, PageIconSet iconSet){
    		this.backgroundPaper = backgroundPaper;
            this.paperColor = paperColor;
            this.backgroundSolidColor = backgroundSolidColor;
            this.iconSet = iconSet;
    	}
    	
    }
    
    public static class TitleThemes {
    	public static final TitleThemes[] TITLE_THEMES = {
    		title = new TitleThemes(PreferenceConstants.DEFAULT_PAGE_TITLE_FONT,
							PreferenceConstants.DEFAULT_PAGE_TITLE_SIZE,
							PreferenceConstants.DEFAULT_PAGE_TITLE_TODAY_COLOR,
							PreferenceConstants.DEFAULT_PAGE_TITLE_TOMORROW_COLOR),
							
    		new TitleThemes(Font.IMPACT, 22,
    						PreferenceConstants.DEFAULT_PAGE_TITLE_TODAY_COLOR,
    						PreferenceConstants.DEFAULT_PAGE_TITLE_TOMORROW_COLOR),
    						
    		new TitleThemes(Font.IMPACT, 30, 0xffb7d9ff, 0xffffb0b4),
    		
    		new TitleThemes(Font.SAN_SERIF, 30,
    						PreferenceConstants.DEFAULT_PAGE_TITLE_TODAY_COLOR,
    						PreferenceConstants.DEFAULT_PAGE_TITLE_TOMORROW_COLOR),
    	};
    	
		public final Font titleFont;
        public final int titleFontSize;
        public final int titleTodayTextColor;
        public final int titleTomorrowTextColor;
        public TitleThemes(Font titleFont, int titleFontSize,
				int titleTodayTextColor, int titleTomorrowTextColor) {
			this.titleFont = titleFont;
			this.titleFontSize = titleFontSize;
			this.titleTodayTextColor = titleTodayTextColor;
			this.titleTomorrowTextColor = titleTomorrowTextColor;
		}
    }
    
    public static class ItemThemes {
    	public static final ItemThemes[] TITLE_THEMES = {
    		item = new ItemThemes(PreferenceConstants.DEFAULT_PAGE_ITEM_FONT,
    						PreferenceConstants.DEFAULT_PAGE_ITEM_FONT_SIZE,
		    				PreferenceConstants.DEFAULT_ITEM_TEXT_COLOR,
		    				PreferenceConstants.DEFAULT_COMPLETED_ITEM_TEXT_COLOR,
		    				PreferenceConstants.DEFAULT_PAGE_ITEM_DIVIDER_COLOR),
		    				
		    new ItemThemes(Font.SAN_SERIF, 16,
		    				0xff333333, 0xff909090, 0x4def9900),
		    
		    new ItemThemes(Font.ELEGANT, 20,
		    				0xffffffff, 0xff7e7e7e, 0x45ffff00),
		    
		    new ItemThemes(Font.CURSIVE, 16, 0xff111111,
		    				0xff555555, 0x30000000),

    	};
    	 public final Font itemFont;
    	    public final int itemFontSize;
    	    public final int itemTextColor;
    	    public final int itemCompletedTextColor;
    	    public final int itemDividerColor;
    	public ItemThemes(Font itemFont, int itemFontSize, int itemTextColor, 
    			int itemCompletedTextColor, int itemDividerColor){
    	this.itemFont = itemFont;
    	this.itemFontSize = itemFontSize;
    	this.itemTextColor = itemTextColor;
    	this.itemCompletedTextColor = itemCompletedTextColor;
    	this.itemDividerColor = itemDividerColor;
    	
    	}
    }

    public static final PageTheme[] PAGE_THEMES = {
        // Default

        new PageTheme(R.string.page_theme_name_paper, R.drawable.page_theme1_preview, color, title, item),

        new PageTheme(R.string.page_theme_name_yellow, R.drawable.page_theme2_preview, color, title, item),

		new PageTheme(R.string.page_theme_name_dark, R.drawable.page_theme3_preview, color, title, item),

		new PageTheme(R.string.page_theme_name_notebook, R.drawable.page_theme4_preview, color, title, item),
    };
		public final boolean backgroundPaper;
		public final int paperColor;
		public final int backgroundSolidColor;
		public final PageIconSet iconSet;
		public final Font titleFont;
		public final int titleFontSize;
		public final int titleTodayTextColor;
		public final int titleTomorrowTextColor;
		public final Font itemFont;
		public final int itemFontSize;
		public final int itemTextColor;
		public final int itemCompletedTextColor;
		public final int itemDividerColor;

    public PageTheme(int nameResourceId, int drawableId, ColorThemes colorThemes, TitleThemes titleThemes, ItemThemes itemThemes) {
        super(nameResourceId, drawableId);
		this.backgroundPaper = colorThemes.backgroundPaper;
		this.paperColor = colorThemes.paperColor;
		this.backgroundSolidColor = colorThemes.backgroundSolidColor;
		this.iconSet = colorThemes.iconSet;
		this.titleFont = titleThemes.titleFont;
		this.titleFontSize = titleThemes.titleFontSize;
		this.titleTodayTextColor = titleThemes.titleTodayTextColor;
		this.titleTomorrowTextColor = titleThemes.titleTomorrowTextColor;
		this.itemFont = itemThemes.itemFont;
		this.itemFontSize = itemThemes.itemFontSize;
		this.itemTextColor = itemThemes.itemTextColor;
		this.itemCompletedTextColor = itemThemes.itemCompletedTextColor;
		this.itemDividerColor = itemThemes.itemDividerColor;
    }
}
