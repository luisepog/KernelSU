package vn.luisepog.lsjb.ui.component.choosekmidialog

import androidx.compose.runtime.Composable
import vn.luisepog.lsjb.ui.LocalUiMode
import vn.luisepog.lsjb.ui.UiMode

@Composable
fun ChooseKmiDialog(
    show: Boolean,
    onDismissRequest: () -> Unit,
    onSelected: (String?) -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> ChooseKmiDialogMiuix(show, onDismissRequest, onSelected)
        UiMode.Material -> ChooseKmiDialogMaterial(show, onDismissRequest, onSelected)
    }
}
