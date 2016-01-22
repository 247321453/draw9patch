/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.draw9patch.ui.action;

import com.android.draw9patch.R;
import com.android.draw9patch.ui.MainFrame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class SaveAsAction extends BackgroundAction {
    public static final String ACTION_NAME = R.string.menu_saveas;
    private MainFrame frame;

    public SaveAsAction(MainFrame frame) {
        this.frame = frame;
        putValue(NAME, R.string.saveas);
        putValue(SHORT_DESCRIPTION, R.string.saveas_short);
        putValue(LONG_DESCRIPTION, R.string.saveas_long);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        executeBackgroundTask(frame.saveAs());
    }
}
