define(['views/shared/model/typemodel'], function(Type) {
  return Type.extend({
    

    validation: {
      type_names: {
        required: true,
        msg: 'This field is required.'
      }
    },

    finish: function(outputModel) {
      outputModel.set('name', this.get('type_names'));
      outputModel.set('instance_type', this.get('instance_type'));
    }

  });
});
