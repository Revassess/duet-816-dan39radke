select *
from user_role, app_user
where user_role.role_id = app_user.roleid;