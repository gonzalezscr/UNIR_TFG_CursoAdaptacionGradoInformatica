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

package cat.diba.oficinasvivienda.service.base;

import cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalServiceUtil;

import java.util.Arrays;

/**
 * @author gonzalezscr
 * @generated
 */
public class OficinaServicioMunicipioLocalServiceClpInvoker {
	public OficinaServicioMunicipioLocalServiceClpInvoker() {
		_methodName0 = "addOficinaServicioMunicipio";

		_methodParameterTypes0 = new String[] {
				"cat.diba.oficinasvivienda.model.OficinaServicioMunicipio"
			};

		_methodName1 = "createOficinaServicioMunicipio";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteOficinaServicioMunicipio";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteOficinaServicioMunicipio";

		_methodParameterTypes3 = new String[] {
				"cat.diba.oficinasvivienda.model.OficinaServicioMunicipio"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchOficinaServicioMunicipio";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getOficinaServicioMunicipio";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getOficinaServicioMunicipios";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getOficinaServicioMunicipiosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateOficinaServicioMunicipio";

		_methodParameterTypes15 = new String[] {
				"cat.diba.oficinasvivienda.model.OficinaServicioMunicipio"
			};

		_methodName48 = "getBeanIdentifier";

		_methodParameterTypes48 = new String[] {  };

		_methodName49 = "setBeanIdentifier";

		_methodParameterTypes49 = new String[] { "java.lang.String" };

		_methodName54 = "obtenerMunicipiosPorOficinaServicio";

		_methodParameterTypes54 = new String[] { "long", "long", "long", "long" };

		_methodName55 = "obtenerMunicipiosPorOficina";

		_methodParameterTypes55 = new String[] {
				"long", "long", "long", "int", "int"
			};

		_methodName56 = "obtenerMunicipiosPorOficinaTotal";

		_methodParameterTypes56 = new String[] { "long", "long", "long" };

		_methodName57 = "obtenerServiciosPorOficina";

		_methodParameterTypes57 = new String[] {
				"long", "long", "long", "int", "int"
			};

		_methodName58 = "obtenerServiciosPorOficinaTotal";

		_methodParameterTypes58 = new String[] { "long", "long", "long" };

		_methodName59 = "nuevaOficinaSM";

		_methodParameterTypes59 = new String[] {
				"cat.diba.oficinasvivienda.model.OficinaServicioMunicipio"
			};

		_methodName60 = "obtenerInfoPorServicio";

		_methodParameterTypes60 = new String[] { "long", "long", "long" };

		_methodName61 = "obtenerOficinas";

		_methodParameterTypes61 = new String[] {
				"long", "long", "java.lang.String[][]", "long[][]", "long[][]",
				"int", "int"
			};

		_methodName62 = "obtenerOficinasTotal";

		_methodParameterTypes62 = new String[] {
				"long", "long", "java.lang.String[][]", "long[][]", "long[][]"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.addOficinaServicioMunicipio((cat.diba.oficinasvivienda.model.OficinaServicioMunicipio)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.createOficinaServicioMunicipio(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.deleteOficinaServicioMunicipio(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.deleteOficinaServicioMunicipio((cat.diba.oficinasvivienda.model.OficinaServicioMunicipio)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.fetchOficinaServicioMunicipio(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.getOficinaServicioMunicipio(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.getOficinaServicioMunicipios(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.getOficinaServicioMunicipiosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.updateOficinaServicioMunicipio((cat.diba.oficinasvivienda.model.OficinaServicioMunicipio)arguments[0]);
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			OficinaServicioMunicipioLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.obtenerMunicipiosPorOficinaServicio(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue());
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.obtenerMunicipiosPorOficina(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.obtenerMunicipiosPorOficinaTotal(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.obtenerServiciosPorOficina(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.obtenerServiciosPorOficinaTotal(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.nuevaOficinaSM((cat.diba.oficinasvivienda.model.OficinaServicioMunicipio)arguments[0]);
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.obtenerInfoPorServicio(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.obtenerOficinas(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String[])arguments[2], (long[])arguments[3],
				(long[])arguments[4], ((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return OficinaServicioMunicipioLocalServiceUtil.obtenerOficinasTotal(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String[])arguments[2], (long[])arguments[3],
				(long[])arguments[4]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
	private String _methodName57;
	private String[] _methodParameterTypes57;
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
	private String _methodName62;
	private String[] _methodParameterTypes62;
}