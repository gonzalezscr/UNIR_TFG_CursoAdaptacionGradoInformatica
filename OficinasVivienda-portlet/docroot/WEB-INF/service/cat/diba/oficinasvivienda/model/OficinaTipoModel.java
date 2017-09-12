/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package cat.diba.oficinasvivienda.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the OficinaTipo service. Represents a row in the &quot;OfiVi_OficinaTipo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link cat.diba.oficinasvivienda.model.impl.OficinaTipoImpl}.
 * </p>
 *
 * @author gonzalezscr
 * @see OficinaTipo
 * @see cat.diba.oficinasvivienda.model.impl.OficinaTipoImpl
 * @see cat.diba.oficinasvivienda.model.impl.OficinaTipoModelImpl
 * @generated
 */
public interface OficinaTipoModel extends BaseModel<OficinaTipo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a oficina tipo model instance should use the {@link OficinaTipo} interface instead.
	 */

	/**
	 * Returns the primary key of this oficina tipo.
	 *
	 * @return the primary key of this oficina tipo
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this oficina tipo.
	 *
	 * @param primaryKey the primary key of this oficina tipo
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this oficina tipo.
	 *
	 * @return the ID of this oficina tipo
	 */
	public long getId();

	/**
	 * Sets the ID of this oficina tipo.
	 *
	 * @param id the ID of this oficina tipo
	 */
	public void setId(long id);

	/**
	 * Returns the id oficina of this oficina tipo.
	 *
	 * @return the id oficina of this oficina tipo
	 */
	public long getIdOficina();

	/**
	 * Sets the id oficina of this oficina tipo.
	 *
	 * @param idOficina the id oficina of this oficina tipo
	 */
	public void setIdOficina(long idOficina);

	/**
	 * Returns the id tipo of this oficina tipo.
	 *
	 * @return the id tipo of this oficina tipo
	 */
	public long getIdTipo();

	/**
	 * Sets the id tipo of this oficina tipo.
	 *
	 * @param idTipo the id tipo of this oficina tipo
	 */
	public void setIdTipo(long idTipo);

	/**
	 * Returns the company ID of this oficina tipo.
	 *
	 * @return the company ID of this oficina tipo
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this oficina tipo.
	 *
	 * @param companyId the company ID of this oficina tipo
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this oficina tipo.
	 *
	 * @return the group ID of this oficina tipo
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this oficina tipo.
	 *
	 * @param groupId the group ID of this oficina tipo
	 */
	public void setGroupId(long groupId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		cat.diba.oficinasvivienda.model.OficinaTipo oficinaTipo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<cat.diba.oficinasvivienda.model.OficinaTipo> toCacheModel();

	@Override
	public cat.diba.oficinasvivienda.model.OficinaTipo toEscapedModel();

	@Override
	public cat.diba.oficinasvivienda.model.OficinaTipo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}