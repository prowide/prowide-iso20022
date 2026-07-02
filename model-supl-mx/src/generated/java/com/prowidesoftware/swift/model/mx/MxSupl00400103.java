
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.004.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanoCtdnSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.004.001.03")
public class MxSupl00400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOCtdnSD1", required = true)
    protected DTCCCANOCustodianSD1V03 dtcccanoCtdnSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CustodianAction1Code.class, CustodianDetailsSD1 .class, CustodianOptionDateDetailsSD1 .class, CustodianRecordAgreementType1Code.class, CustodianRecordCompletenessType1Code.class, DTCCCANOCustodianSD1V03 .class, GCAActionType1Code.class, MxSupl00400103 .class, RelatedCustodianMessageDetailsSD1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.004.001.03";

    public MxSupl00400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00400103(final String xml) {
        this();
        MxSupl00400103 tmp = parse(xml);
        dtcccanoCtdnSD1 = tmp.getDTCCCANOCtdnSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanoCtdnSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOCustodianSD1V03 }
     *     
     */
    public DTCCCANOCustodianSD1V03 getDTCCCANOCtdnSD1() {
        return dtcccanoCtdnSD1;
    }

    /**
     * Sets the value of the dtcccanoCtdnSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOCustodianSD1V03 }
     *     
     */
    public MxSupl00400103 setDTCCCANOCtdnSD1(DTCCCANOCustodianSD1V03 value) {
        this.dtcccanoCtdnSD1 = value;
        return this;
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
    public static MxSupl00400103 parse(String xml) {
        return ((MxSupl00400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00400103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00400103 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00400103) parserImpl.read(MxSupl00400103 .class, xml, _classes));
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
     * Creates an MxSupl00400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00400103 message
     * @return
     *     a new instance of MxSupl00400103
     */
    public final static MxSupl00400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00400103 .class);
    }

}
