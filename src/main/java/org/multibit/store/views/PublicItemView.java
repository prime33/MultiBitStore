package org.multibit.store.views;

import org.multibit.store.model.ItemModel;

/**
 * <p>View to provide the following to resources:</p>
 * <ul>
 * <li>Representation provided by a Freemarker template with a given model</li>
 * </ul>
 * <p>Presenting the view in this manner assists with Freemarker debugging</p>
 *
 * @since 0.0.1
 */
public class PublicItemView extends PublicFreemarkerView<ItemModel> {

  public PublicItemView(String templateName, ItemModel model) {
    super(templateName, model);
  }
}
