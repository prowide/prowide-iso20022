
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
 * Class for supl.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanoSvcDataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.003.001.03")
public class MxSupl00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOSvcDataSD1", required = true)
    protected DTCCCANOServiceDataSD1V03 dtcccanoSvcDataSD1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CashOptionSD5 .class, CorporateActionDateSD4 .class, CorporateActionEventReferenceSD2 .class, CorporateActionNotificationSD1 .class, CorporateActionNotificationSD6 .class, CorporateActionOptionSD5 .class, CorporateActionSD4 .class, CorporateActionSD6 .class, DTCCCANOServiceDataSD1V03 .class, DTCCLinkType1Code.class, DTCCPayoutType1Code.class, DTCCPayoutType2Code.class, DateAndDateTimeChoice.class, DateFormat12Choice.class, DateType6Code.class, EventWorkflowStatus1Code.class, FinancialInstrumentAttributesSD5 .class, FinancialInstrumentAttributesSD7 .class, IdentificationSource4Choice.class, MxSupl00300103 .class, OtherIdentification2 .class, Period3 .class, QualifiedDividendTax1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SecuritiesOptionSD4 .class, SecurityIdentification15 .class, WorkflowStatus1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:supl.003.001.03";

    public MxSupl00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00300103(final String xml) {
        this();
        MxSupl00300103 tmp = parse(xml);
        dtcccanoSvcDataSD1 = tmp.getDTCCCANOSvcDataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanoSvcDataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOServiceDataSD1V03 }
     *     
     */
    public DTCCCANOServiceDataSD1V03 getDTCCCANOSvcDataSD1() {
        return dtcccanoSvcDataSD1;
    }

    /**
     * Sets the value of the dtcccanoSvcDataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOServiceDataSD1V03 }
     *     
     */
    public MxSupl00300103 setDTCCCANOSvcDataSD1(DTCCCANOServiceDataSD1V03 value) {
        this.dtcccanoSvcDataSD1 = value;
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
    public static MxSupl00300103 parse(String xml) {
        return ((MxSupl00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00300103 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00300103) parserImpl.read(MxSupl00300103 .class, xml, _classes));
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
     * Creates an MxSupl00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00300103 message
     * @return
     *     a new instance of MxSupl00300103
     */
    public static final MxSupl00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00300103 .class);
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
