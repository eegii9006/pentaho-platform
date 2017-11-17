/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2017 Hitachi Vantara.. All rights reserved.
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.31 at 02:27:39 PM EDT 
//

package org.pentaho.platform.plugin.services.importer.mimeType.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ImportHandlerDto complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportHandlerDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MimeTypeDefinitions" type="{http://www.pentaho.com/schema/}MimeTypeDefinitionsDto"/>
 *       &lt;/sequence>
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "ImportHandlerDto", propOrder = { "mimeTypeDefinitions" } )
public class ImportHandlerDto {

  @XmlElement( name = "MimeTypeDefinitions", required = true )
  protected MimeTypeDefinitionsDto mimeTypeDefinitions;
  @XmlAttribute( name = "class", required = true )
  protected String clazz;

  /**
   * Gets the value of the mimeTypeDefinitions property.
   * 
   * @return possible object is {@link MimeTypeDefinitionsDto }
   * 
   */
  public MimeTypeDefinitionsDto getMimeTypeDefinitions() {
    return mimeTypeDefinitions;
  }

  /**
   * Sets the value of the mimeTypeDefinitions property.
   * 
   * @param value
   *          allowed object is {@link MimeTypeDefinitionsDto }
   * 
   */
  public void setMimeTypeDefinitions( MimeTypeDefinitionsDto value ) {
    this.mimeTypeDefinitions = value;
  }

  /**
   * Gets the value of the clazz property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getClazz() {
    return clazz;
  }

  /**
   * Sets the value of the clazz property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setClazz( String value ) {
    this.clazz = value;
  }

}