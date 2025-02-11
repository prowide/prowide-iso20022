
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.013.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dataSetMtchRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03")
public class MxTsmt01300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DataSetMtchRpt", required = true)
    protected DataSetMatchReportV03 dataSetMtchRpt;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 13;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Action2Code.class, BICIdentification1 .class, BaselineStatus3Code.class, DataSetMatchReportV03 .class, DataSetType2Code.class, DocumentIdentification10 .class, DocumentIdentification3 .class, DocumentIdentification5 .class, ElementIdentification1 .class, GenericIdentification4 .class, InstructionType3Code.class, MessageIdentification1 .class, MisMatchReport3 .class, MxTsmt01300103 .class, PartyIdentification26 .class, PendingActivity2 .class, PostalAddress5 .class, ReportType3 .class, SimpleIdentificationInformation.class, TransactionStatus4 .class, ValidationResult5 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.013.001.03";

    public MxTsmt01300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01300103(final String xml) {
        this();
        MxTsmt01300103 tmp = parse(xml);
        dataSetMtchRpt = tmp.getDataSetMtchRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dataSetMtchRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetMatchReportV03 }
     *     
     */
    public DataSetMatchReportV03 getDataSetMtchRpt() {
        return dataSetMtchRpt;
    }

    /**
     * Sets the value of the dataSetMtchRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetMatchReportV03 }
     *     
     */
    public MxTsmt01300103 setDataSetMtchRpt(DataSetMatchReportV03 value) {
        this.dataSetMtchRpt = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxTsmt01300103 parse(String xml) {
        return ((MxTsmt01300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt01300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt01300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01300103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01300103) parserImpl.read(MxTsmt01300103 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxTsmt01300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01300103 message
     * @return
     *     a new instance of MxTsmt01300103
     */
    public static final MxTsmt01300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01300103 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
