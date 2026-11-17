package vn.luisepog.lsjb.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import vn.luisepog.lsjb.ui.LocalUiMode
import vn.luisepog.lsjb.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
