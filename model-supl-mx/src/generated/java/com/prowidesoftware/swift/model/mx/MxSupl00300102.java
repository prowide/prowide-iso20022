
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
 * Class for supl.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanoSvcDataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.003.001.02")
public class MxSupl00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOSvcDataSD1", required = true)
    protected DTCCCANOServiceDataSD1V02 dtcccanoSvcDataSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CashOptionSD5 .class, CorporateActionDateSD4 .class, CorporateActionEventReferenceSD2 .class, CorporateActionNotificationSD1 .class, CorporateActionNotificationSD4 .class, CorporateActionOptionSD5 .class, CorporateActionSD4 .class, CorporateActionSD6 .class, DTCCCANOServiceDataSD1V02 .class, DTCCLinkType1Code.class, DTCCPayoutType1Code.class, DTCCPayoutType2Code.class, DateAndDateTimeChoice.class, DateFormat12Choice.class, DateType6Code.class, EventWorkflowStatus1Code.class, FinancialInstrumentAttributesSD5 .class, FinancialInstrumentAttributesSD7 .class, IdentificationSource4Choice.class, MxSupl00300102 .class, OtherIdentification2 .class, Period3 .class, QualifiedDividendTax1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SecuritiesOptionSD1 .class, SecuritiesOptionSD4 .class, SecurityIdentification15 .class, WorkflowStatus1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.003.001.02";

    public MxSupl00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00300102(final String xml) {
        this();
        MxSupl00300102 tmp = parse(xml);
        dtcccanoSvcDataSD1 = tmp.getDTCCCANOSvcDataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanoSvcDataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOServiceDataSD1V02 }
     *     
     */
    public DTCCCANOServiceDataSD1V02 getDTCCCANOSvcDataSD1() {
        return dtcccanoSvcDataSD1;
    }

    /**
     * Sets the value of the dtcccanoSvcDataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOServiceDataSD1V02 }
     *     
     */
    public MxSupl00300102 setDTCCCANOSvcDataSD1(DTCCCANOServiceDataSD1V02 value) {
        this.dtcccanoSvcDataSD1 = value;
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
    public static MxSupl00300102 parse(String xml) {
        return ((MxSupl00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00300102 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00300102) parserImpl.read(MxSupl00300102 .class, xml, _classes));
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
     * Creates an MxSupl00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00300102 message
     * @return
     *     a new instance of MxSupl00300102
     */
    public final static MxSupl00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00300102 .class);
    }

}
