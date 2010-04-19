/*
 * ome.xml.r201004.Well
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) 2010 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by callan via xsd-fu on 2010-04-19 19:23:58+0100
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.r201004;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ome.xml.r201004.enums.*;

public class Well extends Object
{
	// -- Instance variables --

	// Property
	private String status;

	// Property
	private String externalIdentifier;

	// Property
	private Integer column;

	// Property
	private String externalDescription;

	// Property
	private Integer color;

	// Property
	private String id;

	// Property
	private Integer row;

	// Property which occurs more than once
	private List<WellSample> wellSampleList = new ArrayList<WellSample>();

	// Property
	private Reagent reagent;

	// Property which occurs more than once
	private List<Annotation> annotationList = new ArrayList<Annotation>();

	// -- Constructors --

	/** Constructs a Well. */
	public Well()
	{
	}

	// -- Well API methods --

	// Property
	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	// Property
	public String getExternalIdentifier()
	{
		return externalIdentifier;
	}

	public void setExternalIdentifier(String externalIdentifier)
	{
		this.externalIdentifier = externalIdentifier;
	}

	// Property
	public Integer getColumn()
	{
		return column;
	}

	public void setColumn(Integer column)
	{
		this.column = column;
	}

	// Property
	public String getExternalDescription()
	{
		return externalDescription;
	}

	public void setExternalDescription(String externalDescription)
	{
		this.externalDescription = externalDescription;
	}

	// Property
	public Integer getColor()
	{
		return color;
	}

	public void setColor(Integer color)
	{
		this.color = color;
	}

	// Property
	public String getID()
	{
		return id;
	}

	public void setID(String id)
	{
		this.id = id;
	}

	// Property
	public Integer getRow()
	{
		return row;
	}

	public void setRow(Integer row)
	{
		this.row = row;
	}

	// Property which occurs more than once
	public int sizeOfWellSampleList()
	{
		return wellSampleList.size();
	}

	public List<WellSample> copyWellSampleList()
	{
		return new ArrayList<WellSample>(wellSampleList);
	}

	public WellSample getWellSample(int index)
	{
		return wellSampleList.get(index);
	}

	public WellSample setWellSample(int index, WellSample wellSample)
	{
		return wellSampleList.set(index, wellSample);
	}

	public void addWellSample(WellSample wellSample)
	{
		wellSampleList.add(wellSample);
	}

	public void removeWellSample(WellSample wellSample)
	{
		wellSampleList.remove(wellSample);
	}

	// Property
	public Reagent getReagent()
	{
		return reagent;
	}

	public void setReagent(Reagent reagent)
	{
		this.reagent = reagent;
	}

	// Property which occurs more than once
	public int sizeOfAnnotationList()
	{
		return annotationList.size();
	}

	public List<Annotation> copyAnnotationList()
	{
		return new ArrayList<Annotation>(annotationList);
	}

	public Annotation getAnnotation(int index)
	{
		return annotationList.get(index);
	}

	public Annotation setAnnotation(int index, Annotation annotation)
	{
		return annotationList.set(index, annotation);
	}

	public void addAnnotation(Annotation annotation)
	{
		annotationList.add(annotation);
	}

	public void removeAnnotation(Annotation annotation)
	{
		annotationList.remove(annotation);
	}

	public Element asXMLElement(Document document)
	{
		// Creating XML block for Well
		Element Well_element = document.createElement("Well");
		if (status != null)
		{
			// Attribute property Status
			Well_element.setAttribute("Status", status.toString());
		}
		if (externalIdentifier != null)
		{
			// Attribute property ExternalIdentifier
			Well_element.setAttribute("ExternalIdentifier", externalIdentifier.toString());
		}
		if (column != null)
		{
			// Attribute property Column
			Well_element.setAttribute("Column", column.toString());
		}
		if (externalDescription != null)
		{
			// Attribute property ExternalDescription
			Well_element.setAttribute("ExternalDescription", externalDescription.toString());
		}
		if (color != null)
		{
			// Attribute property Color
			Well_element.setAttribute("Color", color.toString());
		}
		if (id != null)
		{
			// Attribute property ID
			Well_element.setAttribute("ID", id.toString());
		}
		if (row != null)
		{
			// Attribute property Row
			Well_element.setAttribute("Row", row.toString());
		}
		if (wellSampleList != null)
		{
			// Element property WellSample which is complex (has
			// sub-elements) and occurs more than once
			for (WellSample wellSampleList_value : wellSampleList)
			{
				Well_element.appendChild(wellSampleList_value.asXMLElement(document));
			}
		}
		if (reagent != null)
		{
			// Element property ReagentRef which is complex (has
			// sub-elements)
			Well_element.appendChild(reagent.asXMLElement(document));
		}
		if (annotationList != null)
		{
			// Element property AnnotationRef which is complex (has
			// sub-elements) and occurs more than once
			for (Annotation annotationList_value : annotationList)
			{
				Well_element.appendChild(annotationList_value.asXMLElement(document));
			}
		}
		return Well_element;
	}
}