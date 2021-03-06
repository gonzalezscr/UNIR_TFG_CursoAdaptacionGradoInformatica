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

package cat.diba.oficinasvivienda.service.persistence;

import cat.diba.oficinasvivienda.model.Tipo;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tipo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gonzalezscr
 * @see TipoPersistenceImpl
 * @see TipoUtil
 * @generated
 */
public interface TipoPersistence extends BasePersistence<Tipo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TipoUtil} to access the tipo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tipos where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching tipos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.Tipo> findBycompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tipos where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @return the range of matching tipos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.Tipo> findBycompanyGroup(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tipos where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tipos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.Tipo> findBycompanyGroup(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo
	* @throws cat.diba.oficinasvivienda.NoSuchTipoException if a matching tipo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.Tipo findBycompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo, or <code>null</code> if a matching tipo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.Tipo fetchBycompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo
	* @throws cat.diba.oficinasvivienda.NoSuchTipoException if a matching tipo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.Tipo findBycompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo, or <code>null</code> if a matching tipo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.Tipo fetchBycompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tipos before and after the current tipo in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param idTipo the primary key of the current tipo
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tipo
	* @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.Tipo[] findBycompanyGroup_PrevAndNext(
		long idTipo, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tipos where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tipos where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching tipos
	* @throws SystemException if a system exception occurred
	*/
	public int countBycompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tipo in the entity cache if it is enabled.
	*
	* @param tipo the tipo
	*/
	public void cacheResult(cat.diba.oficinasvivienda.model.Tipo tipo);

	/**
	* Caches the tipos in the entity cache if it is enabled.
	*
	* @param tipos the tipos
	*/
	public void cacheResult(
		java.util.List<cat.diba.oficinasvivienda.model.Tipo> tipos);

	/**
	* Creates a new tipo with the primary key. Does not add the tipo to the database.
	*
	* @param idTipo the primary key for the new tipo
	* @return the new tipo
	*/
	public cat.diba.oficinasvivienda.model.Tipo create(long idTipo);

	/**
	* Removes the tipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idTipo the primary key of the tipo
	* @return the tipo that was removed
	* @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.Tipo remove(long idTipo)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException;

	public cat.diba.oficinasvivienda.model.Tipo updateImpl(
		cat.diba.oficinasvivienda.model.Tipo tipo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tipo with the primary key or throws a {@link cat.diba.oficinasvivienda.NoSuchTipoException} if it could not be found.
	*
	* @param idTipo the primary key of the tipo
	* @return the tipo
	* @throws cat.diba.oficinasvivienda.NoSuchTipoException if a tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.Tipo findByPrimaryKey(long idTipo)
		throws cat.diba.oficinasvivienda.NoSuchTipoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tipo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idTipo the primary key of the tipo
	* @return the tipo, or <code>null</code> if a tipo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cat.diba.oficinasvivienda.model.Tipo fetchByPrimaryKey(long idTipo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tipos.
	*
	* @return the tipos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.Tipo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @return the range of tipos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.Tipo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cat.diba.oficinasvivienda.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cat.diba.oficinasvivienda.model.Tipo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tipos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tipos.
	*
	* @return the number of tipos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}